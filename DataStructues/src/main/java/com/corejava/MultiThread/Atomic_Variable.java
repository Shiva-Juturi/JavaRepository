package com.corejava.MultiThread;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic_Variable {

	private static class MeetUpEvent {
		private String name;
		private AtomicInteger count = new AtomicInteger(1);

		public MeetUpEvent(String name) {
			this.name = name;
		}

		public void attending(int guestCount) {
			if (guestCount == 1)
				count.incrementAndGet();
			else
				count.addAndGet(guestCount);

		}

		public void notAttending(int guestCount) {
			if (guestCount == 1)
				count.decrementAndGet();
			else {
				boolean updated = false;
				while (!updated) {
					int currentCount = count.get();
					int newCount = currentCount - guestCount;
					updated = count.compareAndSet(currentCount, newCount);
				}
			}
		}

		public int getCount() {
			return count.get();
		}

	}

	public static void main(String[] args) {

		MeetUpEvent hyderabad = new MeetUpEvent("Weekend meetup party ");
		Thread user1 = new Thread(new Runnable() {

			@Override
			public void run() {
				hyderabad.attending(5);
				System.out.println(Thread.currentThread().getName()+ "    "+ hyderabad.getCount());

			}
		});

		Thread user2 = new Thread(new Runnable() {

			@Override
			public void run() {
				hyderabad.attending(5);
				System.out.println(Thread.currentThread().getName() + "    "+ hyderabad.getCount());
				hyderabad.notAttending(4);
				System.out.println(Thread.currentThread().getName()+ "    " + hyderabad.getCount());

			}
		});

		Thread user3 = new Thread(new Runnable() {

			@Override
			public void run() {
				hyderabad.attending(1);
				System.out.println(Thread.currentThread().getName()+ "    " + hyderabad.getCount());

			}
		});
		
		user1.setName("User 1");
		user2.setName("User 2");
		user3.setName("User 3");
		
		user1.start();
		sleep(1);
		user2.start();
		sleep(2);
		user3.start();
		sleep(2);
		System.out.println("Total attending : " + hyderabad.getCount());


	}

	private static void sleep(int i) {
		try {
			TimeUnit.SECONDS.sleep(i);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

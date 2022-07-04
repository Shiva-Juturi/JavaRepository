# K8s Setup in AWS (eksctl )


```
curl --silent --location "https://github.com/weaveworks/eksctl/releases/download/v0.104.0/eksctl_Linux_amd64.tar.gz" | tar xz -C .

sudo mv ./eksctl /usr/local/bin


root@ip-192-168-1-134:~# eksctl create cluster --name ssssss --region us-east-1
2022-07-04 13:16:24 [ℹ]  eksctl version 0.104.0
2022-07-04 13:16:24 [ℹ]  using region us-east-1
2022-07-04 13:16:24 [ℹ]  setting availability zones to [us-east-1f us-east-1d]
2022-07-04 13:16:24 [ℹ]  subnets for us-east-1f - public:192.168.0.0/19 private:192.168.64.0/19
2022-07-04 13:16:24 [ℹ]  subnets for us-east-1d - public:192.168.32.0/19 private:192.168.96.0/19
2022-07-04 13:16:24 [ℹ]  nodegroup "ng-779537c2" will use "" [AmazonLinux2/1.22]
2022-07-04 13:16:24 [ℹ]  using Kubernetes version 1.22
2022-07-04 13:16:24 [ℹ]  creating EKS cluster "ssssss" in "us-east-1" region with managed nodes
2022-07-04 13:16:24 [ℹ]  will create 2 separate CloudFormation stacks for cluster itself and the initial managed nodegroup
2022-07-04 13:16:24 [ℹ]  if you encounter any issues, check CloudFormation console or try 'eksctl utils describe-stacks --region=us-east-1 --cluster=ssssss'
2022-07-04 13:16:24 [ℹ]  Kubernetes API endpoint access will use default of {publicAccess=true, privateAccess=false} for cluster "ssssss" in "us-east-1"
2022-07-04 13:16:24 [ℹ]  CloudWatch logging will not be enabled for cluster "ssssss" in "us-east-1"
2022-07-04 13:16:24 [ℹ]  you can enable it with 'eksctl utils update-cluster-logging --enable-types={SPECIFY-YOUR-LOG-TYPES-HERE (e.g. all)} --region=us-east-1 --cluster=ssssss'
2022-07-04 13:16:24 [ℹ]
2 sequential tasks: { create cluster control plane "ssssss",
    2 sequential sub-tasks: {
        wait for control plane to become ready,
        create managed nodegroup "ng-779537c2",
    }
}
2022-07-04 13:16:24 [ℹ]  building cluster stack "eksctl-ssssss-cluster"
2022-07-04 13:16:24 [ℹ]  deploying stack "eksctl-ssssss-cluster"
2022-07-04 13:16:54 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:17:24 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:18:24 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:19:24 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:20:24 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:21:24 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:22:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:23:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:24:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:25:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:26:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:27:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-cluster"
2022-07-04 13:29:26 [ℹ]  building managed nodegroup stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:29:26 [ℹ]  deploying stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:29:26 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:29:56 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:30:52 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:31:52 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:33:31 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 13:33:31 [ℹ]  waiting for the control plane availability...
2022-07-04 13:33:32 [✔]  saved kubeconfig as "/root/.kube/config"
2022-07-04 13:33:32 [ℹ]  no tasks
2022-07-04 13:33:32 [✔]  all EKS cluster resources for "ssssss" have been created
2022-07-04 13:33:32 [ℹ]  nodegroup "ng-779537c2" has 2 node(s)
2022-07-04 13:33:32 [ℹ]  node "ip-192-168-31-72.ec2.internal" is ready
2022-07-04 13:33:32 [ℹ]  node "ip-192-168-35-126.ec2.internal" is ready
2022-07-04 13:33:32 [ℹ]  waiting for at least 2 node(s) to become ready in "ng-779537c2"
2022-07-04 13:33:32 [ℹ]  nodegroup "ng-779537c2" has 2 node(s)
2022-07-04 13:33:32 [ℹ]  node "ip-192-168-31-72.ec2.internal" is ready
2022-07-04 13:33:32 [ℹ]  node "ip-192-168-35-126.ec2.internal" is ready
2022-07-04 13:33:34 [ℹ]  kubectl command should work with "/root/.kube/config", try 'kubectl get nodes'
2022-07-04 13:33:34 [✔]  EKS cluster "ssssss" in "us-east-1" region is ready
root@ip-192-168-1-134:~# kubectl get nodes
NAME                             STATUS   ROLES    AGE     VERSION
ip-192-168-31-72.ec2.internal    Ready    <none>   2m22s   v1.22.9-eks-810597c
ip-192-168-35-126.ec2.internal   Ready    <none>   2m20s   v1.22.9-eks-810597c
root@ip-192-168-1-134:~#
```

- I connect to my Amazon EKS cluster from my Local

[AWS EKS ](https://aws.amazon.com/premiumsupport/knowledge-center/eks-cluster-connection/)

```
root@LAPTOP-3COO9KN3:~# kubectl config get-contexts
CURRENT   NAME   CLUSTER   AUTHINFO   NAMESPACE
root@LAPTOP-3COO9KN3:~# aws --version
aws-cli/2.7.12 Python/3.9.11 Linux/5.10.16.3-microsoft-standard-WSL2 exe/x86_64.ubuntu.20 prompt/off
root@LAPTOP-3COO9KN3:~# aws sts get-caller-identity
-----------------------------------------------------------------------------------
|                                GetCallerIdentity                                |
+--------------+----------------------------------------+-------------------------+
|    Account   |                  Arn                   |         UserId          |
+--------------+----------------------------------------+-------------------------+
|  406553770210|  arn:aws:iam::406553770210:user/samba  |  AIDAV5KD6HDRPPRELAWQV  |
+--------------+----------------------------------------+-------------------------+
root@LAPTOP-3COO9KN3:~# aws eks --region us-east-1  update-kubeconfig --name ssssss
Added new context arn:aws:eks:us-east-1:406553770210:cluster/ssssss to /root/.kube/config
root@LAPTOP-3COO9KN3:~# kubectl config get-context
error: unknown command "get-context"
See 'kubectl config -h' for help and examples
root@LAPTOP-3COO9KN3:~# kubectl config get-contexts
CURRENT   NAME                                                CLUSTER                                             AUTHINFO                                            NAMESPACE
*         arn:aws:eks:us-east-1:406553770210:cluster/ssssss   arn:aws:eks:us-east-1:406553770210:cluster/ssssss   arn:aws:eks:us-east-1:406553770210:cluster/ssssss
root@LAPTOP-3COO9KN3:~#
```
- i am able see  to all pod from my local  
```

root@LAPTOP-3COO9KN3:~# kubectl config get-contexts
CURRENT   NAME                                                CLUSTER                                             AUTHINFO                                            NAMESPACE
*         arn:aws:eks:us-east-1:406553770210:cluster/ssssss   arn:aws:eks:us-east-1:406553770210:cluster/ssssss   arn:aws:eks:us-east-1:406553770210:cluster/ssssss
root@LAPTOP-3COO9KN3:~# kubectl get po -A
NAMESPACE     NAME                         READY   STATUS             RESTARTS   AGE
default       sambasiva-7797497b5b-4c97r   1/1     Running            0          13m
default       sambasiva-7797497b5b-pk8vt   1/1     Running            0          13m
default       sambasiva-7797497b5b-t4kzf   1/1     Running            0          13m
default       utils-695c6cd98-2s68w        0/1     ImagePullBackOff   0          19m
default       utils-695c6cd98-d4hcz        0/1     ImagePullBackOff   0          19m
default       utils-695c6cd98-q9sxd        0/1     ImagePullBackOff   0          19m
kube-system   aws-node-8gdjq               1/1     Running            0          38m
kube-system   aws-node-c58qk               1/1     Running            0          38m
kube-system   coredns-7f5998f4c-jkpvl      1/1     Running            0          46m
kube-system   coredns-7f5998f4c-wt92j      1/1     Running            0          46m
kube-system   kube-proxy-b9sd2             1/1     Running            0          38m
kube-system   kube-proxy-bsq4f             1/1     Running            0          38m
root@LAPTOP-3COO9KN3:~#
```
- i can see all not running pods
```
root@LAPTOP-3COO9KN3:~# kubectl config get-contexts
CURRENT   NAME                                                CLUSTER                                             AUTHINFO                                            NAMESPACE
*         arn:aws:eks:us-east-1:406553770210:cluster/ssssss   arn:aws:eks:us-east-1:406553770210:cluster/ssssss   arn:aws:eks:us-east-1:406553770210:cluster/ssssss
root@LAPTOP-3COO9KN3:~# kubectl get po -A
NAMESPACE     NAME                         READY   STATUS             RESTARTS   AGE
default       sambasiva-7797497b5b-4c97r   1/1     Running            0          13m
default       sambasiva-7797497b5b-pk8vt   1/1     Running            0          13m
default       sambasiva-7797497b5b-t4kzf   1/1     Running            0          13m
default       utils-695c6cd98-2s68w        0/1     ImagePullBackOff   0          19m
default       utils-695c6cd98-d4hcz        0/1     ImagePullBackOff   0          19m
default       utils-695c6cd98-q9sxd        0/1     ImagePullBackOff   0          19m
kube-system   aws-node-8gdjq               1/1     Running            0          38m
kube-system   aws-node-c58qk               1/1     Running            0          38m
kube-system   coredns-7f5998f4c-jkpvl      1/1     Running            0          46m
kube-system   coredns-7f5998f4c-wt92j      1/1     Running            0          46m
kube-system   kube-proxy-b9sd2             1/1     Running            0          38m
kube-system   kube-proxy-bsq4f             1/1     Running            0          38m
root@LAPTOP-3COO9KN3:~#

```
- pod is not running  so i am  troubleshooting   issue

```

root@LAPTOP-3COO9KN3:~# kubectl describe po utils-695c6cd98-2s68w -n default
Name:         utils-695c6cd98-2s68w
Namespace:    default
Priority:     0
Node:         ip-192-168-35-126.ec2.internal/192.168.35.126
Start Time:   Mon, 04 Jul 2022 19:20:19 +0530
Labels:       env=green
              pod-template-hash=695c6cd98
Annotations:  kubernetes.io/psp: eks.privileged
Status:       Pending
IP:           192.168.45.202
IPs:
  IP:           192.168.45.202
Controlled By:  ReplicaSet/utils-695c6cd98
Containers:
  nalini-demo:
    Container ID:
    Image:          nginx:1234
    Image ID:
    Port:           <none>
    Host Port:      <none>
    State:          Waiting
      Reason:       ImagePullBackOff
    Ready:          False
    Restart Count:  0
    Environment:    <none>
    Mounts:
      /var/run/secrets/kubernetes.io/serviceaccount from kube-api-access-k2ks7 (ro)
Conditions:
  Type              Status
  Initialized       True
  Ready             False
  ContainersReady   False
  PodScheduled      True
Volumes:
  kube-api-access-k2ks7:
    Type:                    Projected (a volume that contains injected data from multiple sources)
    TokenExpirationSeconds:  3607
    ConfigMapName:           kube-root-ca.crt
    ConfigMapOptional:       <nil>
    DownwardAPI:             true
QoS Class:                   BestEffort
Node-Selectors:              <none>
Tolerations:                 node.kubernetes.io/not-ready:NoExecute op=Exists for 300s
                             node.kubernetes.io/unreachable:NoExecute op=Exists for 300s
Events:
  Type     Reason     Age                   From               Message
  ----     ------     ----                  ----               -------
  Normal   Scheduled  23m                   default-scheduler  Successfully assigned default/utils-695c6cd98-2s68w to ip-192-168-35-126.ec2.internal
  Warning  Failed     22m (x6 over 23m)     kubelet            Error: ImagePullBackOff
  Normal   Pulling    21m (x4 over 23m)     kubelet            Pulling image "nginx:1234"
  Warning  Failed     21m (x4 over 23m)     kubelet            Failed to pull image "nginx:1234": rpc error: code = Unknown desc = Error response from daemon: manifest for nginx:1234 not found: manifest unknown: manifest unknown
  Warning  Failed     21m (x4 over 23m)     kubelet            Error: ErrImagePull
  Normal   BackOff    3m23s (x89 over 23m)  kubelet            Back-off pulling image "nginx:1234"
root@LAPTOP-3COO9KN3:~#
```
- To check all running pod on which node
```
root@LAPTOP-3COO9KN3:~# kubectl get po -A  -o wide
NAMESPACE     NAME                         READY   STATUS             RESTARTS   AGE   IP               NODE                             NOMINATED NODE   READINESS GATES
default       sambasiva-7797497b5b-4c97r   1/1     Running            0          20m   192.168.54.190   ip-192-168-35-126.ec2.internal   <none>           <none>
default       sambasiva-7797497b5b-pk8vt   1/1     Running            0          20m   192.168.2.190    ip-192-168-31-72.ec2.internal    <none>           <none>
default       sambasiva-7797497b5b-t4kzf   1/1     Running            0          20m   192.168.62.8     ip-192-168-35-126.ec2.internal   <none>           <none>
default       utils-695c6cd98-2s68w        0/1     ImagePullBackOff   0          26m   192.168.45.202   ip-192-168-35-126.ec2.internal   <none>           <none>
default       utils-695c6cd98-d4hcz        0/1     ImagePullBackOff   0          26m   192.168.31.219   ip-192-168-31-72.ec2.internal    <none>           <none>
default       utils-695c6cd98-q9sxd        0/1     ImagePullBackOff   0          26m   192.168.42.184   ip-192-168-35-126.ec2.internal   <none>           <none>
kube-system   aws-node-8gdjq               1/1     Running            0          45m   192.168.31.72    ip-192-168-31-72.ec2.internal    <none>           <none>
kube-system   aws-node-c58qk               1/1     Running            0          45m   192.168.35.126   ip-192-168-35-126.ec2.internal   <none>           <none>
kube-system   coredns-7f5998f4c-jkpvl      1/1     Running            0          53m   192.168.4.57     ip-192-168-31-72.ec2.internal    <none>           <none>
kube-system   coredns-7f5998f4c-wt92j      1/1     Running            0          53m   192.168.22.229   ip-192-168-31-72.ec2.internal    <none>           <none>
kube-system   kube-proxy-b9sd2             1/1     Running            0          45m   192.168.31.72    ip-192-168-31-72.ec2.internal    <none>           <none>
kube-system   kube-proxy-bsq4f             1/1     Running            0          45m   192.168.35.126   ip-192-168-35-126.ec2.internal   <none>           <none>
root@LAPTOP-3COO9KN3:~#

```
- To check k8s rs ,deploy , nodes and services
```
root@LAPTOP-3COO9KN3:~# kubectl get rs
NAME                   DESIRED   CURRENT   READY   AGE
sambasiva-7797497b5b   3         3         3       22m
utils-695c6cd98        3         3         0       28m
root@LAPTOP-3COO9KN3:~# kubectl get deploy
NAME        READY   UP-TO-DATE   AVAILABLE   AGE
sambasiva   3/3     3            3           22m
utils       0/3     3            0           28m
root@LAPTOP-3COO9KN3:~# kubectl get svc
NAME         TYPE        CLUSTER-IP   EXTERNAL-IP   PORT(S)   AGE
kubernetes   ClusterIP   10.100.0.1   <none>        443/TCP   55m
root@LAPTOP-3COO9KN3:~# kubectl get no
NAME                             STATUS   ROLES    AGE   VERSION
ip-192-168-31-72.ec2.internal    Ready    <none>   48m   v1.22.9-eks-810597c
ip-192-168-35-126.ec2.internal   Ready    <none>   48m   v1.22.9-eks-810597c
root@LAPTOP-3COO9KN3:~#
```
- To Delete cluster

```
root@ip-192-168-1-134:~# eksctl delete cluster --name ssssss  --region us-east-1
2022-07-04 14:26:27 [ℹ]  deleting EKS cluster "ssssss"
2022-07-04 14:26:27 [ℹ]  will drain 0 unmanaged nodegroup(s) in cluster "ssssss"
2022-07-04 14:26:27 [ℹ]  starting parallel draining, max in-flight of 1
2022-07-04 14:26:27 [ℹ]  deleted 0 Fargate profile(s)
2022-07-04 14:26:28 [✔]  kubeconfig has been updated
2022-07-04 14:26:28 [ℹ]  cleaning up AWS load balancers created by Kubernetes objects of Kind Service or Ingress
2022-07-04 14:26:28 [ℹ]
2 sequential tasks: { delete nodegroup "ng-779537c2", delete cluster control plane "ssssss" [async]
}
2022-07-04 14:26:28 [ℹ]  will delete stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:26:28 [ℹ]  waiting for stack "eksctl-ssssss-nodegroup-ng-779537c2" to get deleted
2022-07-04 14:26:28 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:26:58 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:27:39 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:28:27 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:29:25 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:30:31 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:32:08 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:32:53 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:34:38 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:35:24 [ℹ]  waiting for CloudFormation stack "eksctl-ssssss-nodegroup-ng-779537c2"
2022-07-04 14:35:24 [ℹ]  will delete stack "eksctl-ssssss-cluster"
2022-07-04 14:35:24 [✔]  all cluster resources were deleted
root@ip-192-168-1-134:~#

```

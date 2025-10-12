# Pod
Create the Pod:
```bash
kubectl apply -f resources.yml
```

List the Pods:
```bash
kubectl get pods -o wide
```

Access Minikube:
```bash
minikube ssh
```

Access the docs:
```bash
curl <your-pod-ip>
```

Destroy the Pod:
```bash
kubectl delete -f resources.yml
```

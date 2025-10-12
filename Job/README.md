# Job
Create the Job:
```bash
kubectl apply -f resources.yml
```

List the jobs:
```bash
kubectl get jobs
```

List the Pods:
```bash
kubectl get pods
```

List the logs:
```bash
kubectl logs <your-pod-name>
```

Destroy the Job:
```bash
kubectl delete -f resources.yml
```

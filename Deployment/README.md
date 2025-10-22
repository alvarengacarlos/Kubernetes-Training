# Deployment

> **Info**: Can perform rolling updates and manage ReplicaSets.

Create the Deployment:
```bash
kubectl apply -f resources.yml
```

List the Deployments:
```bash
kubectl get deployments
```

List the Pods:
```bash
kubectl get pods
```

Destroy one pod:
```bash
kubectl delete pod <your-pod-id>
```

List the Pods again:
```bash
kubectl get pods
```

Destroy the Deployment:
```bash
kubectl delete -f resources.yml
```

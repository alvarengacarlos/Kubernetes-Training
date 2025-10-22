# Service

Create the Service:
```bash
kubectl apply -f resources.yml
```

List the Service:
```bash
kubectl get services
```

List the Deployment:
```bash
kubectl get deployments
```

List the Pods:
```bash
kubectl get pods
```

Access:
```bash
minikube service doc-service
```

Destroy the Service:
```bash
kubectl delete -f resources.yml
```

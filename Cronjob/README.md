# Cronjob
Create the Cronjob:
```bash
kubectl apply -f resources.yml
```

List the Cronjobs:
```bash
kubectl get cronjobs
```

wait one minute.

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

# Persistent Volume
Create the Persistent Volume:
```bash
kubectl apply -f resources.yml
```

List the Persistent Volume:
```bash
kubectl get pv
```

Destroy the Pod:
```bash
kubectl delete pod doc-pod
```

List the Persistent Volume:
```bash
kubectl get pv
```

Destroy the Pod:
```bash
kubectl delete -f resources.yml
```

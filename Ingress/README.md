# Ingress

Create the Ingress:
```bash
kubectl apply -f resources.yml
```

List the Ingress:
```bash
kubectl get ingress
```

> **Tip**: Wait some minutes if the address is empty.

Using a browser, access the address, http and https will work.

Destroy the Service:
```bash
kubectl delete -f resources.yml
```

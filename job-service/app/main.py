from requests import get

url = "https://www.google.com.br"

response = get(url=url)

if response.status_code == 200:
    print("UP")
else:
    print("DOWN")

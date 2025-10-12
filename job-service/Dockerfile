FROM python:3

WORKDIR /app

RUN pip install uv

COPY app/main.py .
COPY app/pyproject.toml .
COPY app/uv.lock .

CMD [ "uv", "run", "main.py" ]

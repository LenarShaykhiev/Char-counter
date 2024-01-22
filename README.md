# Char-counter
## Инструкция для запуска приложения:
```
$ java -jar char-counter-0.0.1-SNAPSHOT
```

## Реализованные функции:
Порт приложения: `localhost:80`

- счетчик каждого символа во входящей строке.

## Взаимодействие:
Формат входящих/исходящих данных - application/json

Пример запроса:
```
PUT localhost/api/lines/count/eachChar
Content-type: application/json

{
  "line": "hello world"
}
```
Ответ:
```
HTTP/1.1 200 
Content-Type: text/plain;charset=UTF-8
Content-Length: 51
Date: Mon, 22 Jan 2024 19:05:42 GMT
Keep-Alive: timeout=60
Connection: keep-alive

l: 3, o: 2, space: 1, r: 1, d: 1, e: 1, w: 1, h: 1
```


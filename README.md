# Para probar los endpoints use los siguientes endpoints

## Crear libro

```
POST 'http://localhost:8080/book/create'
{
    "authorName": "Mario",
    "authorSurname": "Mendoza",
    "description": "Scorpio City",
    "pages": 200,
    "price": 50000,
    "title": "Scorpio City",
    "year": 1995
}
```

## Obtener libro por titulo

```
GET 'http://localhost:8080/book/title/{titulo}
```

## Obtener libro por autor

```
POST 'http://localhost:8080/book/author'
{
    "authorName": "Mario",
    "authorSurname": "Mendoza"
}
```
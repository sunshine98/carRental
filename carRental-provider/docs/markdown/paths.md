

### Register renter
```
POST /renter
```


#### Parameters

|Type|Name|Description|Schema|
|---|---|---|---|
|**Body**|**registerRenterDTO**  <br>*optional*|registerRenterDTO|[RegisterRenterDTO](#registerrenterdto)|


#### Responses

|HTTP Code|Description|Schema|
|---|---|---|
|**200**|OK|[ResultVo](#resultvo)|
|**201**|Created|No Content|
|**401**|Unauthorized|No Content|
|**403**|Forbidden|No Content|
|**404**|Not Found|No Content|


#### Consumes

* `application/json`


#### Produces

* `application/json`


#### Tags

* renter


#### Security

|Type|Name|Scopes|
|---|---|---|
|**apiKey**|**[Authorization](#authorization)**|global|




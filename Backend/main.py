from fastapi import FastAPI,Request

app=FastAPI()

@app.middleware("http")
async def middleware(request,call_next):
    print("1")
    response = await call_next(request)

    print("2")
    return response

@app.get("/")
def home():
    return {"Message":"Hello WOrld!"}

@app.post("/items")
def get_items(item:dict):
    return {"items":item}

@app.post("/search/{item_id}")
async def search(request:Request):
    qp=request.query_params
    body=await request.body()
    para=request.path_params
    header=request.headers

    return {"Query_Param":qp,"Body":body,"Path_Param":para,"Header":header}
from fastapi import FastAPI

app = FastAPI()

@app.get("/")
async def read_root():
    list = ["apple", "cherry"]
    if "banana" in list:
        list.remove("banana")
    else:
        list.append("banana")
    return {"fruits": list}
from typing import Optional
from pydantic import BaseModel, field_validator

class Address(BaseModel):
    street: str
    city: str
    zip_code: str   
    

class Student(BaseModel):
    name: str
    age: int
    address: Address

try:
    
    addr = Address(street="123 Main St", city="Springfield", zip_code="12345")
    s1 = Student(name="Pramod", age=10, address=addr)
    
    print(s1.model_dump())
    print(s1.model_dump_json())
    
except Exception as e:
    print(f"Error: {e}")
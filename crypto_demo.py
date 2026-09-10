import hashlib
from Crypto.PublicKey import RSA

password_hash = hashlib.md5(b"hello").hexdigest()

key = RSA.generate(2048)
print(key)

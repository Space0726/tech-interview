# Generator
def simple_gen():
    yield "Hello"
    yield "World"

gen = simple_gen()
print(next(gen))
print(next(gen))

# Coroutine
def coro():
    hello = yield "Hello"
    yield hello

c = coro()
print(next(c))
print(c.send("World"))  # Generator에 값을 보냄

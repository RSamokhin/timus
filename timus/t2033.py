import sys
i = 0
devices = {}
while i < 6:
    name = sys.stdin.readline().strip()
    device = sys.stdin.readline().strip()
    price = int(sys.stdin.readline())
    if devices.get(device) is None:
        devices[device] = {
            'price': price,
            'amount': 1
        }
    else:
        devices[device] = {
            'price': min(devices[device]['price'], price),
            'amount': devices[device]['amount'] + 1,
        }
    i += 1

resultDevice = ''
resultPrice = 0
m = 0
for phone in devices.keys():
    amount = devices.get(phone)['amount']
    price = devices.get(phone)['price']
    if amount > m or (amount == m and price <= resultPrice):
        resultDevice = phone
        m = amount
        resultPrice = price

print resultDevice
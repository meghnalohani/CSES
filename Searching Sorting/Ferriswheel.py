[n,w]=[int(x) for x in input().split()]
arr = [int(x) for x in input().split()]
arr.sort()
lightestKid = 0
heaviestKid = n -1
gondolaCount = 0
kidsingondola = 0

while(kidsingondola < n):
    if lightestKid == heaviestKid:
        gondolaCount=gondolaCount+1
        kidsingondola = kidsingondola+1
        break
    if (arr[lightestKid]+arr[heaviestKid]<=w):
        gondolaCount=gondolaCount+1
        lightestKid=lightestKid+1
        heaviestKid=heaviestKid-1
        kidsingondola=kidsingondola+2
    else:
        gondolaCount=gondolaCount+1
        heaviestKid=heaviestKid-1
        kidsingondola=kidsingondola+1
print(gondolaCount)
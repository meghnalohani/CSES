[n,m,k]=[int(x) for x in input().split()]
applicants = [int(x) for x in input().split()]
apartments = [int(x) for x in input().split()]

apartments.sort()
applicants.sort()
x=0 
y=0
count=0
while(x < n and y < m):
    if(abs(applicants[x]-apartments[y])<=k):
        count=count+1
        x=x+1
        y=y+1
    else:
        if (applicants[x]-apartments[y]>k):
            y=y+1
        else:
            x=x+1
print(count)


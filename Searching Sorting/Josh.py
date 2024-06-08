# n = int(input())
# #k=int(input())
# arr = [x for x in range(1,n+1)]

# def remove(arr,index,k):
#     if len(arr) == 1:
#         print(arr[0],end=' ')
#     else:
#         index = (index+k)%len(arr)
#         print(arr.pop(index))
#         remove(arr,index,k)

# remove(arr,0,1)
# n = int(input())
# # k = int(input())  # The k variable is set to 1 in your code, so it's not needed here

# arr = [x for x in range(1, n + 1)]

# def remove(arr, k):
#     index = 0
#     while len(arr) > 1:
#         index = (index + k) % len(arr)
#         print(arr.pop(index), end=' ')
#     print(arr[0], end=' ')

# remove(arr, 1)

def josephus(n, k):
    if n == 1:
        return 0
    else:
        return (josephus(n - 1, k) + k-1) % n + 1

n = int(input())
# k = int(input())  # The k variable is set to 1 in your code, so it's not needed here

result = josephus(n, 1) + 1  # Adding 1 to convert 0-based index to 1-based
print(result)



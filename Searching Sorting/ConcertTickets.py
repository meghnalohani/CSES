# There are n concert tickets available, each with a certain price. Then, m customers arrive, one after another.
# Each customer announces the maximum price they are willing to pay for a ticket, and after this, they will get a ticket with the nearest possible price such that it does not exceed the maximum price.
[n,m] = [int(x) for x in input().split()]
tickets = [int(x) for x in input().split()]
maxPrice = [int(x) for x in input().split()]
tickets.sort()
for customer in maxPrice:
    leastDiff=max, currentDiff
    leastdiffFound = False
    for ticket in tickets:
        currentDiff = customer - ticket
        if currentDiff>=0 and currentDiff < leastDiff:
            leastdiff = currentDiff
            leastdiffFound = True
    if leastdiffFound:
        print(ticket)
        leastdiffFound=False
        
        

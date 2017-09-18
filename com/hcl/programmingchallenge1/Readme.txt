a. Design and implementation:

 We will design the fastest solution using multithreading with two Java queues. 
 ConcurrentLinkedQueue is a thread-safe queue and is the data structure for our project.
 We create two tasks - Randomizer and Prime,  which has the two ConcurrentLinkedQueue 
 objects - inQueue and outQueue. Threads are created with each of these tasks and are 
 started at the same time.  Randomizer generates a random integer between 1 and 50 
 inclusive and writes to the inQueue. Before reading an object from outQueue, the current 
 thread sleeps for 500 milli seconds, to give enough time to the Prime thread to read the 
 integer from inQueue, verifies if it is prime and write the result object to outQueue. 
 The Prime thread sleeps for 500 milli seconds before procesing the next Integer object 
 from inQueue.
 
 
b. Sample output:
Next Integer 40 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=40, prime=false]
Next Integer 42 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=42, prime=false]
Next Integer 26 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=26, prime=false]
Next Integer 7 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=7, prime=true]
Next Integer 6 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=6, prime=false]
Next Integer 20 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=20, prime=false]
Next Integer 37 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=37, prime=true]
Next Integer 33 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=33, prime=false]
Next Integer 16 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=16, prime=false]
Next Integer 31 added to the input queue by Randomizer
Randomizer received response - PrimeResponse [number=31, prime=true]


c. Further work:
This solution can further be enhanced using distributed JMS queues.
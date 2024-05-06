# Complexity_Analysis_and_Array

     ** Time and Space complexity **

1. Analyze the time complexity of the following Java code and suggest a way to improve it:
int sum = 0;
for(int i = 1; i <= n; i++) {
for(int j = 1; j <= i; j++) {
sum++;
}
}
Solution :
The time complexity of this code is O(n^2) as it uses nested loops, where the outer loop runs n times and the inner
loop runs i times where i varies from 1 to n.
The total number of operations performed can be calculated by summing the total number of operations in each
iteration of the outer loop. The inner loop will run i times on the i-th iteration of the outer loop. So the number of
operations is (1+2+3+...+n) which is n(n+1)/2, which is O(n^2).
One way to improve the time complexity of this code is to use a mathematical formula to find the sum instead of
using nested loops.
2. Find the value of T(2) for the recurrence relation T(n) = 3T(n-1) + 12n, given that T(0) = 5.
Solution : given T(n) = 3T(n-1) + 12n
Substituting the values in the relation:
T(1) = 3T(0) + 12
=> T(1) = 15 + 12 = 27
T(2) = 3T(1) + 12 * 2
=>T(2) = 3 * 27 + 24 = 81 + 24
Hence T(2) = 105.
3. Given a recurrence relation, solve it using a substitution method. Relation : T(n) = T(n - 1) + c.
Solution: Let the solution be T(n) = O(n), now let’s prove this using the induction method.
For that to happen T(n) <= cn where c is some constant.
T(n) = T(n - 1) + c
T(n - 1) = T(n - 2) + c
T(n - 2) = T(n - 3) + c
|
|
T(2) = T(1) + c
—------------------------ Adding all above equations
T(n) = T(1) + cn
Let us assume T(1) to be a constant value.
T(n) = k + cn
Therefore, T(n) <= cn
Hence we can conclude T(n) = O(n).

4. Given a recurrence relation:
T(n) = 16T(n/4) + n2logn
Find the time complexity of this relation using the master theorem.
Solution: Fromthegivenrecurrencerelationwecanobtainthevalueofdifferentparameterssuchasa,b,p,and
k.
Therelation:T(n)=16T(n/4)+n2logn
Here,a=16
b=4
k=2
p=1
bk=42=16
Herea=bk
Alsop>-1
HenceT(n)=θ(nlogab*logp+1n)
ThereforeT(n)=θ(nlog164*log1+1n)=θ(n1/2log2n)

5. Solve the following recurrence relation using recursion tree method
T(n) = 2T(n/2) + n
To solve the recurrence relation \( T(n) = 2T(n/2) + n \) using the recursion tree method, we follow these steps:

1: **Set up the recursion tree**: Each level of the tree will express the costs incurred at that stage of the recursion. We start by writing the initial condition and expand based on the recurrence.

   - At the root of the tree, we have \( T(n) \).
   - At the first level, the problem is divided into two subproblems, each of size \( n/2 \). The cost at this level (not counting recursive calls) is \( n \).
   - At the second level, each of these two subproblems of size \( n/2 \) is further divided, resulting in four subproblems of size \( n/4 \). The cost at each of the two branches at this level is \( n/2 \), so the total cost at this level is \( 2 \times (n/2) = n \).
   - This pattern continues, with the \( k \)-th level consisting of \( 2^k \) subproblems each of size \( n/2^k \), and the total cost at each level remaining \( n \).

2: **Construct the tree**:
   - **Level 0**: \( T(n) \)
   - **Level 1**: \( 2T(n/2) + n \) — Cost \( n \)
   - **Level 2**: \( 4T(n/4) + n \) — Cost \( n \)
   - **Level 3**: \( 8T(n/8) + n \) — Cost \( n \)
   - ...
   - **Level k**: \( 2^k T(n/2^k) + n \) — Cost \( n \)

3: **Calculate the height of the tree**: The recursion bottoms out when the size of the subproblems is 1. Setting \( n/2^k = 1 \) gives us \( n = 2^k \). Taking the logarithm of both sides yields \( k = \log_2 n \). Hence, the height of the tree is \( \log_2 n \).

4: **Sum the costs per level**: Since the cost at each level is \( n \) and there are \( \log_2 n + 1 \) levels (starting from level 0), the total cost is
   \[ \sum_{i=0}^{\log_2 n} n = n (\log_2 n + 1) = n \log_2 n + n. \]

Hence, the solution to the recurrence relation \( T(n) = 2T(n/2) + n \) is \( T(n) = \Theta(n \log n) \). This means that \( T(n) \) grows as \( n \log n \) as \( n \) increases.

6. T(n) = 2T(n/2) + K, Solve using Recurrence tree method.
To solve the recurrence relation \( T(n) = 2T(n/2) + K \) using the recurrence tree method, we first visualize how the recursion expands and then sum up the costs at each level of the tree to find the overall time complexity.

### Step 1: Draw the Recurrence Tree

1: **Level 0:**
   - At the root, the work done is \( K \), and the problem size is \( n \).
   - \( T(n) = K + 2T(n/2) \)

2: **Level 1:**
   - Each of the two subproblems has a size of \( n/2 \) and a cost of \( K \) each.
   - Total cost at this level: \( 2K \) 
   - These expand to: \( 2T(n/2) = 2(K + 2T(n/4)) \)

3: **Level 2:**
   - Each of the four subproblems now has a size of \( n/4 \) and a cost of \( K \) each.
   - Total cost at this level: \( 4K \)
   - These expand to: \( 4T(n/4) = 4(K + 2T(n/8)) \)

### Step 2: Continue Expanding

If we continue this pattern, we see that at each level the number of subproblems doubles, and the size of each subproblem is halved. The cost at each level remains constant \( K \) multiplied by the number of subproblems at that level.

### Step 3: Sum the Costs at Each Level

1: **Level 0:** Cost = \( K \)
2: **Level 1:** Cost = \( 2K \)
3: **Level 2:** Cost = \( 4K \)
4: **Level i:** Cost = \( 2^i K \)

### Step 4: Determine the Height of the Tree

The tree continues until the subproblem size becomes 1. At each level, the size of the problem is halved, so the height \( h \) of the tree is the number of times \( n \) can be divided by 2 until it reaches 1. This is the definition of the logarithm to base 2:

\[ n / 2^h = 1 \Rightarrow n = 2^h \Rightarrow h = \log_2 n \]

### Step 5: Sum All Levels' Costs

We sum the costs from all levels:

\[ K + 2K + 4K + \ldots + 2^{\log_2 n}K \]

This is a geometric series where the sum can be computed as:

\[ \sum_{i=0}^{\log_2 n} 2^i K = K \left(2^0 + 2^1 + 2^2 + \ldots + 2^{\log_2 n}\right) = K (2^{\log_2 n + 1} - 1) \]

Since \( 2^{\log_2 n} = n \), the sum becomes:

\[ K(2n - 1) \]

 Conclusion

Therefore, the total cost \( T(n) \) in terms of Big-O notation, taking only the highest order term and ignoring constants and lower order terms, is \( O(n) \). Thus, the recurrence relation \( T(n) = 2T(n/2) + K \) solves to \( T(n) = O(n) \).


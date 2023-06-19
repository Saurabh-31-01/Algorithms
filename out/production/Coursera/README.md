# Algorithms

1) Union-find which I used in dynamic connectivity :- best algo for it is Weighted quick union path compression 
                                                  O(N + M lg * N) { M union-find operations on a set of N objects}
Applications:- 
  Percolation.
・Games (Go, Hex).
✓ Dynamic connectivity.
・Least common ancestor.
・Equivalence of finite state automata.
・Hoshen-Kopelman algorithm in physics.
・Hinley-Milner polymorphic type inference.
・Kruskal's minimum spanning tree algorithm.
・Compiling equivalence statements in Fortran.
・Morphological attribute openings and closings.
・Matlab's by label() function in image processing

2) Search in Bitonic Array - O(lg N)

3) Optimized Three sum - O(n ^ 2):- Here I used two pointers which replace the third for loop from code by which time gets reduced from n ^ 3 to n ^ 2

4) Stack = i) using LinkedList (it gives us constant time in the worst case also)
           ii) using fixed Size Array (In this case only array build takes N time rest operations are very fast
                                        it could take constant time in the rest of the operation){But the main drawback with fixed Size Array
                                        is the client has to deal with the Size of the Array}
           iii) using Resizable Array (so to overcome the drawback of fixed Size Array we used Resizable Array)
                                       {when the array Size is full then we doubled its Size and when the array is one-quarter full we halved its size}
                                       [it takes the worst case of N (because of doubling and halving) for push and pop operation but it takes constant amortized time]
           so Array is between 25% to 100% full.
           LinkedList = 1) Every operation takes constant time in the worst case
                        2) uses extra time to deal with links
           Arrays    =  1) Every Operation takes constant amortized time
                        2) Less Wasted space

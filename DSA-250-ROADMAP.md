# DSA 250: Concept-First LeetCode Roadmap

A progression from fundamentals to hard interview patterns. The difficulty labels are practical study guidance, not a guarantee of platform difficulty. Solve in order within each category, and do not rush to the next problem until you can explain the invariant and complexity.

## How to Use This Roadmap

For every problem:

1. **Understand:** write the input, output, constraints, and two edge cases.
2. **Model:** name the data structure or pattern before coding.
3. **Attempt:** work for 25-40 minutes without reading a solution.
4. **Learn:** if stuck, study only the key idea, then close it and reimplement.
5. **Prove:** state the invariant, correctness argument, time complexity, and space complexity.
6. **Revisit:** solve again after 1 day, 1 week, and 1 month. Keep a short mistake log.

Suggested pace: 5 problems per week gives 50 weeks. Spend more time on the first problem of every category because it teaches the pattern that follows.

## Phase 1: Arrays and Hashing

1. **Easy** - Two Sum (1) - hash map lookup and complement invariant
2. **Easy** - Contains Duplicate (217) - set membership
3. **Easy** - Valid Anagram (242) - frequency counting
4. **Easy** - Intersection of Two Arrays (349) - set construction
5. **Easy** - Majority Element (169) - Boyer-Moore voting
6. **Easy** - Best Time to Buy and Sell Stock (121) - running minimum
7. **Easy** - Missing Number (268) - arithmetic or XOR
8. **Easy** - Find All Numbers Disappeared in an Array (448) - index marking
9. **Medium** - Group Anagrams (49) - canonical keys
10. **Medium** - Top K Frequent Elements (347) - frequency plus buckets/heap
11. **Medium** - Product of Array Except Self (238) - prefix and suffix products
12. **Medium** - Longest Consecutive Sequence (128) - hash-set sequence starts
13. **Medium** - Subarray Sum Equals K (560) - prefix-sum frequencies
14. **Medium** - Sort Colors (75) - Dutch national flag
15. **Medium** - Longest Subarray of 1's After Deleting One Element (1493) - zero budget
16. **Medium** - Set Matrix Zeroes (73) - in-place markers
17. **Medium** - Spiral Matrix (54) - boundary simulation
18. **Medium** - Rotate Image (48) - transpose and reverse
19. **Medium** - Game of Life (289) - encoded in-place state
20. **Medium** - Next Permutation (31) - lexicographic rearrangement
21. **Medium** - H-Index (274) - counting or sorting
22. **Medium** - Find the Duplicate Number (287) - cycle detection
23. **Hard** - First Missing Positive (41) - cyclic placement
24. **Hard** - Trapping Rain Water (42) - prefix maxima or two pointers
25. **Hard** - Maximum Product Subarray (152) - positive/negative states

## Phase 2: Strings

26. **Easy** - Valid Palindrome (125) - normalized two pointers
27. **Easy** - Longest Common Prefix (14) - prefix comparison
28. **Easy** - Is Subsequence (392) - forward scan
29. **Easy** - Roman to Integer (13) - lookahead parsing
30. **Easy** - Find the Difference (389) - XOR or counts
31. **Medium** - Longest Substring Without Repeating Characters (3) - sliding window
32. **Medium** - Longest Palindromic Substring (5) - expand around center
33. **Medium** - Palindromic Substrings (647) - center expansion
34. **Medium** - String to Integer (atoi) (8) - parser states and overflow
35. **Medium** - Encode and Decode Strings (271) - length-prefix design
36. **Medium** - Multiply Strings (43) - manual digit multiplication
37. **Medium** - Compare Version Numbers (165) - token parsing
38. **Medium** - Find All Anagrams in a String (438) - fixed sliding window
39. **Medium** - Minimum Window Substring (76) - required-count window
40. **Medium** - Longest Repeating Character Replacement (424) - max-frequency window
41. **Medium** - Letter Combinations of a Phone Number (17) - recursive construction
42. **Hard** - Longest Valid Parentheses (32) - stack or boundary DP
43. **Hard** - Word Break II (140) - memoized sentence construction
44. **Hard** - Substring with Concatenation of All Words (30) - aligned windows
45. **Hard** - Shortest Palindrome (214) - prefix matching / KMP idea

## Phase 3: Two Pointers and Sliding Window

46. **Easy** - Merge Sorted Array (88) - fill from the end
47. **Easy** - Move Zeroes (283) - stable compaction
48. **Easy** - Remove Duplicates from Sorted Array (26) - write pointer
49. **Easy** - Valid Palindrome II (680) - one allowed deletion
50. **Medium** - Two Sum II - Input Array Is Sorted (167) - opposing pointers
51. **Medium** - 3Sum (15) - sorted deduplication
52. **Medium** - 4Sum (18) - layered two pointers
53. **Medium** - Container With Most Water (11) - discard shorter boundary
54. **Medium** - Boats to Save People (881) - greedy pairing
55. **Medium** - Partition Labels (763) - last occurrence boundaries
56. **Medium** - Max Consecutive Ones III (1004) - at-most-k window
57. **Medium** - Fruit Into Baskets (904) - two distinct values
58. **Medium** - Permutation in String (567) - frequency window
59. **Medium** - Subarray Product Less Than K (713) - multiplicative window
60. **Medium** - Minimum Size Subarray Sum (209) - shrinkable positive window
61. **Medium** - Grumpy Bookstore Owner (1052) - fixed gain window
62. **Medium** - Frequency of the Most Frequent Element (1838) - sorted cost window
63. **Hard** - Sliding Window Maximum (239) - monotonic deque
64. **Hard** - Minimum Number of K Consecutive Bit Flips (995) - lazy flip window
65. **Hard** - Subarrays with K Different Integers (992) - difference of at-most counts

## Phase 4: Stack, Queue, and Monotonic Structures

66. **Easy** - Valid Parentheses (20) - matching stack
67. **Easy** - Implement Queue using Stacks (232) - amortized transfer
68. **Easy** - Backspace String Compare (844) - reverse scan or stack
69. **Easy** - Baseball Game (682) - stack simulation
70. **Medium** - Min Stack (155) - auxiliary minimum state
71. **Medium** - Evaluate Reverse Polish Notation (150) - operand stack
72. **Medium** - Daily Temperatures (739) - decreasing monotonic stack
73. **Medium** - Next Greater Element II (503) - circular scan
74. **Medium** - Car Fleet (853) - arrival-time stack
75. **Medium** - Decode String (394) - nested state stacks
76. **Medium** - Asteroid Collision (735) - resolve opposing stack items
77. **Medium** - Simplify Path (71) - canonical path stack
78. **Medium** - Remove K Digits (402) - increasing stack
79. **Medium** - Online Stock Span (901) - compressed monotonic stack
80. **Hard** - Largest Rectangle in Histogram (84) - nearest smaller boundaries

## Phase 5: Binary Search and Ordered Search

81. **Easy** - Binary Search (704) - half-open interval invariant
82. **Easy** - Search Insert Position (35) - lower bound
83. **Easy** - First Bad Version (278) - first true predicate
84. **Easy** - Sqrt(x) (69) - numeric binary search
85. **Medium** - Search in Rotated Sorted Array (33) - sorted half
86. **Medium** - Find Minimum in Rotated Sorted Array (153) - pivot invariant
87. **Medium** - Search in Rotated Sorted Array II (81) - duplicate ambiguity
88. **Medium** - Find First and Last Position of Element in Sorted Array (34) - two bounds
89. **Medium** - Koko Eating Bananas (875) - binary search on answer
90. **Medium** - Capacity To Ship Packages Within D Days (1011) - feasible capacity
91. **Medium** - Split Array Largest Sum (410) - minimize maximum partition
92. **Medium** - Time Based Key-Value Store (981) - timestamp upper bound
93. **Medium** - Search a 2D Matrix (74) - flattened ordering
94. **Medium** - Median of Two Sorted Arrays (4) - partition balance
95. **Hard** - Find in Mountain Array (1095) - peak plus two searches

## Phase 6: Linked Lists

96. **Easy** - Reverse Linked List (206) - pointer rewiring
97. **Easy** - Merge Two Sorted Lists (21) - sentinel and merge
98. **Easy** - Linked List Cycle (141) - fast and slow pointers
99. **Easy** - Palindrome Linked List (234) - reverse second half
100. **Easy** - Intersection of Two Linked Lists (160) - pointer path switching
101. **Medium** - Remove Nth Node From End of List (19) - fixed gap
102. **Medium** - Reorder List (143) - split, reverse, interleave
103. **Medium** - Add Two Numbers (2) - carry simulation
104. **Medium** - Copy List with Random Pointer (138) - map or interleaving
105. **Medium** - LRU Cache (146) - hash map plus doubly linked list
106. **Medium** - Swap Nodes in Pairs (24) - local rewiring
107. **Medium** - Rotate List (61) - circular connection
108. **Medium** - Sort List (148) - linked-list merge sort
109. **Hard** - Merge k Sorted Lists (23) - heap or divide and conquer
110. **Hard** - Reverse Nodes in k-Group (25) - bounded group rewiring

## Phase 7: Trees and Binary Search Trees

111. **Easy** - Maximum Depth of Binary Tree (104) - DFS height
112. **Easy** - Same Tree (100) - structural recursion
113. **Easy** - Invert Binary Tree (226) - recursive mutation
114. **Easy** - Symmetric Tree (101) - mirrored traversal
115. **Easy** - Binary Tree Preorder Traversal (144) - traversal mechanics
116. **Easy** - Binary Tree Inorder Traversal (94) - stack simulation
117. **Easy** - Binary Tree Level Order Traversal (102) - BFS levels
118. **Easy** - Search in a Binary Search Tree (700) - ordering property
119. **Easy** - Lowest Common Ancestor of a BST (235) - split point
120. **Medium** - Validate Binary Search Tree (98) - propagated bounds
121. **Medium** - Kth Smallest Element in a BST (230) - inorder rank
122. **Medium** - Construct Binary Tree from Preorder and Inorder Traversal (105) - root partition
123. **Medium** - Binary Tree Right Side View (199) - level frontier
124. **Medium** - Count Good Nodes in Binary Tree (1448) - path maximum
125. **Medium** - Diameter of Binary Tree (543) - height plus global answer
126. **Medium** - Balanced Binary Tree (110) - sentinel height
127. **Medium** - Path Sum II (113) - root-to-leaf backtracking
128. **Medium** - Binary Tree Zigzag Level Order Traversal (103) - alternating levels
129. **Medium** - Populating Next Right Pointers in Each Node (116) - level links
130. **Medium** - Serialize and Deserialize Binary Tree (297) - unambiguous encoding
131. **Medium** - Binary Tree Maximum Path Sum (124) - gain DP
132. **Medium** - Flatten Binary Tree to Linked List (114) - preorder rewiring
133. **Medium** - House Robber III (337) - include/exclude tree DP
134. **Medium** - All Nodes Distance K in Binary Tree (863) - parent graph plus BFS
135. **Medium** - Delete Node in a BST (450) - successor replacement

## Phase 8: Heaps and Greedy Algorithms

136. **Easy** - Last Stone Weight (1046) - max heap simulation
137. **Easy** - Assign Cookies (455) - sorted greedy matching
138. **Easy** - Maximum Units on a Truck (1710) - value density greedy
139. **Medium** - Kth Largest Element in an Array (215) - heap or quickselect
140. **Medium** - K Closest Points to Origin (973) - bounded heap
141. **Medium** - Find Median from Data Stream (295) - two heaps
142. **Medium** - Task Scheduler (621) - frequency scheduling
143. **Medium** - Reorganize String (767) - greedy max heap
144. **Medium** - Meeting Rooms II (253) - end-time heap
145. **Medium** - Furthest Building You Can Reach (1642) - spend ladders on largest climbs
146. **Medium** - IPO (502) - capital-gated max heap
147. **Medium** - Minimum Cost to Hire K Workers (857) - ratio and bounded wages
148. **Hard** - Smallest Range Covering Elements from K Lists (632) - multiway heap
149. **Hard** - Minimum Number of Refueling Stops (871) - deferred max heap
150. **Hard** - Candy (135) - two directional greedy passes

## Phase 9: Intervals and Sweep Lines

151. **Easy** - Summary Ranges (228) - contiguous runs
152. **Medium** - Data Stream as Disjoint Intervals (352) - ordered interval merging
153. **Medium** - Merge Intervals (56) - sort by start
154. **Medium** - Insert Interval (57) - three interval regions
155. **Medium** - Non-overlapping Intervals (435) - earliest finishing greedy
156. **Medium** - Meeting Rooms (252) - overlap detection
157. **Medium** - Minimum Number of Arrows to Burst Balloons (452) - endpoint greedy
158. **Medium** - Interval List Intersections (986) - two interval pointers
159. **Medium** - Car Pooling (1094) - difference array sweep
160. **Hard** - My Calendar III (732) - sweep-line maximum overlap

## Phase 10: Backtracking and Recursion

161. **Easy** - Binary Tree Paths (257) - recursive path construction
162. **Easy** - Subsets (78) - choose or skip
163. **Easy** - Letter Case Permutation (784) - binary choices
164. **Medium** - Permutations (46) - used-set recursion
165. **Medium** - Combinations (77) - increasing start index
166. **Medium** - Combination Sum (39) - reusable choices
167. **Medium** - Combination Sum II (40) - duplicate skipping
168. **Medium** - Subsets II (90) - sort and skip siblings
169. **Medium** - Generate Parentheses (22) - valid-prefix constraints
170. **Medium** - Palindrome Partitioning (131) - cut positions
171. **Medium** - Word Search (79) - grid DFS and undo
172. **Medium** - Restore IP Addresses (93) - bounded parsing
173. **Medium** - Matchsticks to Square (473) - bucket assignment
174. **Hard** - N-Queens (51) - column and diagonal constraints
175. **Hard** - Sudoku Solver (37) - constraint propagation and search

## Phase 11: Graph Traversal and Union-Find

176. **Easy** - Find if Path Exists in Graph (1971) - DFS/BFS reachability
177. **Easy** - Flood Fill (733) - grid traversal
178. **Easy** - Number of Islands (200) - component counting
179. **Easy** - Find Center of Star Graph (1791) - degree observation
180. **Medium** - Clone Graph (133) - traversal plus identity map
181. **Medium** - Max Area of Island (695) - component size
182. **Medium** - Pacific Atlantic Water Flow (417) - reverse reachability
183. **Medium** - Surrounded Regions (130) - border-connected components
184. **Medium** - Rotting Oranges (994) - multi-source BFS
185. **Medium** - Course Schedule (207) - cycle detection
186. **Medium** - Course Schedule II (210) - topological ordering
187. **Medium** - Graph Valid Tree (261) - union-find or DFS
188. **Medium** - Number of Connected Components in an Undirected Graph (323) - DSU
189. **Medium** - Redundant Connection (684) - DSU cycle edge
190. **Medium** - Accounts Merge (721) - DSU over shared identifiers
191. **Medium** - Word Ladder (127) - BFS state graph
192. **Medium** - Open the Lock (752) - shortest state search
193. **Medium** - Evaluate Division (399) - weighted graph traversal
194. **Medium** - Network Delay Time (743) - Dijkstra
195. **Medium** - Cheapest Flights Within K Stops (787) - bounded relaxation
196. **Medium** - Min Cost to Connect All Points (1584) - MST
197. **Medium** - Reconstruct Itinerary (332) - Eulerian path
198. **Medium** - Alien Dictionary (269) - inferred topological graph
199. **Hard** - Critical Connections in a Network (1192) - Tarjan low-link values
200. **Hard** - Swim in Rising Water (778) - minimax search / DSU
201. **Hard** - Word Ladder II (126) - BFS layers plus backtracking

## Phase 12: Dynamic Programming

202. **Easy** - Climbing Stairs (70) - one-dimensional recurrence
203. **Easy** - Min Cost Climbing Stairs (746) - rolling DP
204. **Easy** - House Robber (198) - choose or skip
205. **Easy** - Maximum Subarray (53) - Kadane's algorithm
206. **Medium** - House Robber II (213) - circular choose-or-skip DP
207. **Medium** - Coin Change (322) - unbounded knapsack minimization
208. **Medium** - Coin Change II (518) - combinations versus permutations
209. **Medium** - Partition Equal Subset Sum (416) - 0/1 knapsack
210. **Medium** - Target Sum (494) - signed choices / subset transform
211. **Medium** - Longest Increasing Subsequence (300) - sequence DP or tails
212. **Medium** - Longest Common Subsequence (1143) - two-string grid
213. **Medium** - Edit Distance (72) - insertion/deletion/replacement
214. **Medium** - Word Break (139) - prefix feasibility
215. **Medium** - Decode Ways (91) - valid suffix transitions
216. **Medium** - Unique Paths (62) - grid counting
217. **Medium** - Minimum Path Sum (64) - grid minimization
218. **Medium** - Triangle (120) - bottom-up path DP
219. **Medium** - Longest Palindromic Subsequence (516) - interval DP
220. **Hard** - Longest Increasing Path in a Matrix (329) - memoized grid DAG
221. **Medium** - Best Time to Buy and Sell Stock with Cooldown (309) - finite states
222. **Medium** - Best Time to Buy and Sell Stock with Transaction Fee (714) - state transitions
223. **Medium** - Interleaving String (97) - two-prefix DP
224. **Hard** - Number of Ways to Form a Target String Given a Dictionary (1639) - column counting DP
225. **Medium** - Combination Sum IV (377) - ordered-count DP
226. **Medium** - Delete and Earn (740) - reduce to house robber
227. **Hard** - Maximum Subarray Min-Product (1856) - monotonic boundaries plus prefix sums
228. **Medium** - Burst Balloons (312) - interval DP by last burst
229. **Medium** - Palindrome Partitioning II (132) - minimum cuts
230. **Hard** - Minimum Cost to Cut a Stick (1547) - interval DP by first cut
231. **Hard** - Number of Ways of Cutting a Pizza (1444) - suffix counts plus memoization
232. **Hard** - Strange Printer (664) - interval compression DP
233. **Hard** - Scramble String (87) - interval partition DP
234. **Hard** - Maximal Rectangle (85) - histogram reduction

## Phase 13: Tries, Bit Manipulation, Math, and Design

235. **Easy** - Number of 1 Bits (191) - clear lowest set bit
236. **Easy** - Counting Bits (338) - recurrence by removing a bit
237. **Easy** - Reverse Bits (190) - positional construction
238. **Easy** - Power of Two (231) - single-bit test
239. **Medium** - Implement Trie (Prefix Tree) (208) - prefix navigation
240. **Medium** - Design Add and Search Words Data Structure (211) - trie plus DFS
241. **Medium** - Word Search II (212) - trie-guided grid DFS
242. **Medium** - Single Number II (137) - bit counts modulo three
243. **Medium** - Sum of Two Integers (371) - bitwise addition
244. **Medium** - Pow(x, n) (50) - exponentiation by squaring
245. **Medium** - Integer to Roman (12) - greedy denomination encoding
246. **Medium** - Random Pick with Weight (528) - prefix sums and sampling
247. **Medium** - Insert Delete GetRandom O(1) (380) - array plus index map
248. **Hard** - Maximum Gap (164) - bucket-based linear sorting
249. **Hard** - Find the Shortest Superstring (943) - overlap graph plus subset DP
250. **Hard** - LFU Cache (460) - frequency buckets and linked lists

## Milestones and Depth Checks

- **After 25:** you should be comfortable with sets, maps, prefix state, and in-place arrays.
- **After 65:** you should recognize fixed, variable, and monotonic sliding windows.
- **After 95:** you should be able to define a binary-search predicate and prove its monotonicity.
- **After 135:** you should be fluent with DFS/BFS tree invariants and BST ordering.
- **After 175:** you should distinguish recursion, backtracking, greedy choice, and heap scheduling.
- **After 201:** you should select BFS, DFS, DSU, Dijkstra, MST, or topological sort from graph properties.
- **After 234:** you should be able to define a DP state, transition, base case, and iteration order.
- **After 250:** choose 20 problems you previously struggled with and solve them from a blank editor without notes.

## Weekly Review Template

```text
Problem:
Pattern:
Brute-force idea:
Chosen invariant or state:
Why the algorithm is correct:
Time complexity:
Space complexity:
Mistake made:
One variation to try:
Review dates: tomorrow / one week / one month
```

## Rules for Real Progress

- Do not count a problem as learned because you watched a solution.
- Reimplement after learning the idea, then explain it aloud without code.
- Keep separate notes for patterns and mistakes; patterns are reusable, mistakes are personal.
- For every hard problem, first solve a smaller version or identify the nearest medium problem in this list.
- Every fifth problem should be a timed review problem selected from an earlier phase.





## 题目

设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。

push(x) —— 将元素 x 推入栈中。
pop() —— 删除栈顶的元素。
top() —— 获取栈顶元素。
getMin() —— 检索栈中的最小元素。


示例:

输入：
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

输出：
[null,null,null,null,-3,null,0,-2]

解释：
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.


提示：

pop、top 和 getMin 操作总是在 非空栈 上调用。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/min-stack
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。



















## 说明

### 方法一：辅助栈（官方题解）

#### 思路

要做出这道题目，首先要理解栈结构先进后出的性质。

对于栈来说，如果一个元素 a 在入栈时，栈里有其它的元素 b, c, d，那么无论这个栈在之后经历了什么操作，只要 a 在栈中，b, c, d 就一定在栈中，因为在 a 被弹出之前，b, c, d 不会被弹出。

因此，在操作过程中的任意一个时刻，只要栈顶的元素是 a，那么我们就可以确定栈里面现在的元素一定是 a, b, c, d。

那么，我们可以在每个元素 a 入栈时把当前栈的最小值 m 存储起来。在这之后无论何时，如果栈顶元素是 a，我们就可以直接返回存储的最小值 m。

![](https://assets.leetcode-cn.com/solution-static/155/155_fig1.gif)

#### 算法

按照上面的思路，我们只需要设计一个数据结构，使得每个元素 a 与其相应的最小值 m 时刻保持一一对应。因此我们可以使用一个辅助栈，与元素栈同步插入与删除，用于存储与每个元素对应的最小值。

当一个元素要入栈时，我们取当前辅助栈的栈顶存储的最小值，与当前元素比较得出最小值，将这个最小值插入辅助栈中；

当一个元素要出栈时，我们把辅助栈的栈顶元素也一并弹出；

在任意一个时刻，栈内元素的最小值就存储在辅助栈的栈顶元素中。



#### 复杂度分析

时间复杂度：对于题目中的所有操作，时间复杂度均为 O(1)。因为栈的插入、删除与读取操作都是 O(1)，我们定义的每个操作最多调用栈操作两次。

空间复杂度：O(n)，其中 n 为总操作数。最坏情况下，我们会连续插入 n 个元素，此时两个栈占用的空间为 O(n)。





### 方法二：一个栈

#### 思路

> 感觉跟方法一的思路也差不多

- 此方法与方法一不一样，不需要维护一个最小值的单调栈stackMin，只需要将前面出现过的最小值埋在stack中


- 进栈push(int x)操作时，需要判断x与最小值的大小
  - 若x <= min，则表示需要更新最小值，将当前最小值进栈push(min)保存前面的最小值，且更新最小值，再将元素进栈push(x) 注意：此处的栈顶元素是此时的栈顶元素也是栈的最小值
  - 若x > min,则直接将元素进栈push(x)
- 出栈pop()操作时，需要判断min是否与栈顶元素相同
  
  - 若相同，说明该元素下方埋着前一个的最小值，需要将栈顶元素pop出，还需要将下一个栈顶元素（前一个最小值）pop出，并且赋值给min

#### 算法



#### 复杂度分析

时间复杂度 O(1)


































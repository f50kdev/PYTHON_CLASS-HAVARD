n = int(input("Enter the number of data points: "))
x = [float(input(f"Enter x value {i + 1}: ")) for i in range(n)]
y = [float(input(f"Enter y value {i + 1}: ")) for i in range(n)]

m_x, m_y = sum(x) / n, sum(y) / n
p = sum((x[i] - m_x) * (y[i] - m_y) for i in range(n)) / (sum((x[i] - m_x)**2 for i in range(n)) ** 0.5 * sum((y[i] - m_y)**2 for i in range(n)) ** 0.5)

def rank(vals):
    sorted_vals = sorted(enumerate(vals), key=lambda v: v[1])
    ranks = [0] * len(vals)
    i = 0
    while i < len(sorted_vals):
        j = i
        while j < len(sorted_vals) and sorted_vals[j][1] == sorted_vals[i][1]:
            j += 1
        avg = (i + j + 1) / 2
        for k in range(i, j):
            ranks[sorted_vals[k][0]] = avg
        i = j
    return ranks

r_x, r_y = rank(x), rank(y)
r = 1 - 6 * sum((r_x[i] - r_y[i]) ** 2 for i in range(n)) / (n * (n**2 - 1))

print("Pearson Correlation:", p)
print("Rank Correlation:", r)

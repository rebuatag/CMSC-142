def main():
	array = [1,3,5,2,4,6]

	counting(array)

	
def counting(array):
	
	if len(array) == 1:
		return array

	else:
		left = array[:len(array)/2]
		right = array[len(array)/2:]

		left, ai = counting(left)
		right, bi = counting(right)
		final = []


		i , j = 0
		inversions = 0 + ai + bi


		while i < len(left) and j <len(right):
				if left[i] <= right[j]:
					c.append(left[i])
					i+=1
				else:
					c.append[right[j]]
					j+=1
					inversions += (len(left) -1)

		c += left[i:]
		c += right[j:]

		return c, inversions


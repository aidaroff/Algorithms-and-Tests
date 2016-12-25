# author: Alibek Aidarov

def insertion_sort(some_array):
    '''
    Implementation of insertion sort algorithm from CLRS textbook
    '''
    j = 1

    while j < len(some_array):
        key = some_array[j]
        i = j - 1

        while i >= 0 and some_array[i] > key:
            some_array[i + 1] = some_array[i]
            i -= 1

        some_array[i + 1] = key
        j += 1

    return some_array

print insertion_sort([2,1])
assert [1,2] == insertion_sort([2,1])

print insertion_sort([56, 32, 0, -1, 102, 101, 5432])
assert [-1, 0, 32, 56, 101, 102, 5432] == insertion_sort([56, 32, 0, -1, 102, 101, 5432])

print insertion_sort([0])
assert [0] == insertion_sort([0])

print insertion_sort([-1,-1,-1])
assert [-1, -1, -1] == insertion_sort([-1,-1,-1])

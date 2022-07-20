import pytest

# # code for fixture creation
@pytest.fixture
def list_of_num():
    list_num = list(range(0,11))
    return list

# Test Method for verification of sum of the list elements
def test_list_sum(list_of_num):
    sum = 0
    # loop for iterating over the list elements and adding elements
    for i in list_of_num:
        sum += i
    assert sum == 55
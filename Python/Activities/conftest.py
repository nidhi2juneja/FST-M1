import pytest

# code for fixture creation
@pytest.fixture
def list_of_num():
    list_num = list(range(0,11))
    return list
from tracemalloc import start


class Route(object):
    id = int
    start = []
    end = []

    def __init__(self, *args):
        super(Route, self).__init__(*args)

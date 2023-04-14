class LabelModel(Object):
    """
    color string Required
    default boolean Required
    description string or null Required
    id integer Required
    name string Required
    node_id string Required
    url string Required
    """
    def __init__(self, color, default, description, id, name, node_id, url):
        pass
    def __repr__(self):
        return f"{id}:{name}"
Observer Pattern = “One-to-Many Notification System”

## The one who generates updates = Subject / Observable
## The ones who want updates = Observers / Listeners

* Examples:
-- Chat application notifies all connected users.
-- Weather app notifies all subscribed users.
-- News app notifies all subscribed users.
-- E-commerce app notifies all subscribed users.
-- Social media app notifies all followers.

     +----------------------+
     |      Subject         |
     |----------------------|
     | + attach(obs)        |
     | + detach(obs)        |
     | + notifyObservers()  |
     +----------+-----------+
                |
                | notifies
                v
        +-----------------+
        |    Observer     |
        |-----------------|
        | + update()      |
        +--------+--------+
                 ^
        +--------+----------+
        |                   |
+---------------+   +----------------+
| Observer1     |   | Observer2      |
| update()      |   | update()       |
+---------------+   +----------------+

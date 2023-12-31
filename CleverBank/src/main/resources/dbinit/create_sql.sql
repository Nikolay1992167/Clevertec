CREATE TABLE banks
(
    id    BIGSERIAL PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    bic   VARCHAR(11)  NOT NULL
);

CREATE TABLE users
(
    id       BIGSERIAL PRIMARY KEY,
    name     VARCHAR(255) NOT NULL,
    email    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE accounts
(
    id        BIGSERIAL PRIMARY KEY,
    currency  VARCHAR(20)    NOT NULL,
    date_open TIMESTAMPTZ    NOT NULL,
    number    VARCHAR(20)    NOT NULL,
    balance   DECIMAL(10, 2) NOT NULL,
    bank_id   INTEGER        NOT NULL REFERENCES banks (id) ON DELETE CASCADE,
    user_id   INTEGER        NOT NULL REFERENCES users (id) ON DELETE CASCADE
);

CREATE TABLE transactions
(
    id               BIGSERIAL PRIMARY KEY,
    type_transaction VARCHAR(20)    NOT NULL,
    from_account     VARCHAR(20),
    to_account       VARCHAR(20),
    amount           DECIMAL(10, 2) NOT NULL,
    date             TIMESTAMPTZ    NOT NULL
);

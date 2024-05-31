INSERT INTO labels (val) VALUES ('New');
INSERT INTO labels (val) VALUES ('Old');
INSERT INTO labels (val) VALUES ('Used');
INSERT INTO labels (val) VALUES ('Vintage');

INSERT INTO items (name) VALUES ('Chair');
INSERT INTO items (name) VALUES ('Table');

INSERT INTO items_labels (item_id, labels_id) VALUES (1, 1);
INSERT INTO items_labels (item_id, labels_id) VALUES (1, 3);
INSERT INTO items_labels (item_id, labels_id) VALUES (2, 2);
INSERT INTO items_labels (item_id, labels_id) VALUES (2, 4);
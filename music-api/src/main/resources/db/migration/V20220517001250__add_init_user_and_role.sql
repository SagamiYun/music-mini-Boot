INSERT INTO `user` (id, username, nickname, password, created_time, updated_time)
VALUES ('1', 'admin', 'SagamiYun', '$2a$10$8Tcm9AGOw8.pbc0pHHLhyu.uYk8cfCj.C4Mff.VbVaCw6pwN6ihWq',
        '2022-05-15 14:30:31.312000',
        '2022-05-15 14:30:31.312000');
INSERT INTO `role` (id, name, title, created_time, updated_time)
VALUES ('1', 'ROLE_USER', '普通用户', '2022-05-15 14:30:31.312000', '2022-05-15 14:30:31.312000');
INSERT INTO `role` (id, name, title, created_time, updated_time)
VALUES ('2', 'ROLE_ADMIN', '超级管理员', '2022-05-15 14:30:31.312000', '2022-05-15 14:30:31.312000');
INSERT INTO `user_role` (user_id, role_id)
VALUES ('1', '1');
INSERT INTO `user_role` (user_id, role_id)
VALUES ('1', '2');
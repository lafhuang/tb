DROP TABLE
    tb_user_role;
/*==============================================================*/
/* Table: tb_user_role                                         */
/*==============================================================*/
CREATE TABLE
    tb_user_role
    (
        id SERIAL NOT NULL,
        user_id INTEGER NULL,
        role_id INTEGER NULL,
        CONSTRAINT PK_SYS_USER_ROLE PRIMARY KEY (id)
    );
COMMENT ON TABLE tb_user_role
IS
    '用户角色表';
COMMENT ON column tb_user_role.id
IS
    '角色ID';
COMMENT ON column tb_user_role.user_id
IS
    '用户ID';
COMMENT ON column tb_user_role.role_id
IS
    '角色ID';

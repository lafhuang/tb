DROP TABLE
    tb_role;
/*==============================================================*/
/* Table: tb_role                                              */
/*==============================================================*/
CREATE TABLE
    tb_role
    (
        id SERIAL NOT NULL,
        role_name TEXT NULL,
        role_sign TEXT NULL,
        role_desc TEXT NULL,
        create_by INTEGER NULL,
        create_time TIMESTAMP NULL,
        update_by INTEGER NULL,
        update_time TIMESTAMP NULL,
        CONSTRAINT PK_SYS_ROLE PRIMARY KEY (id)
    );
COMMENT ON TABLE tb_role
IS
    '角色表';
COMMENT ON column tb_role.id
IS
    'ID';
COMMENT ON column tb_role.role_name
IS
    '角色名称';
COMMENT ON column tb_role.role_sign
IS
    '角色标识';
COMMENT ON column tb_role.role_desc
IS
    '角色描述';
COMMENT ON column tb_role.create_by
IS
    '创建用户';
COMMENT ON column tb_role.create_time
IS
    '创建时间';
COMMENT ON column tb_role.update_by
IS
    '修改用户';
COMMENT ON column tb_role.update_time
IS
    '修改时间';

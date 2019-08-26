DROP TABLE
    tb_menu;
/*==============================================================*/
/* Table: tb_menu                                              */
/*==============================================================*/
CREATE TABLE
    tb_menu
    (
        id SERIAL NOT NULL,
        menu_name TEXT NULL,
        parent_id INTEGER NULL,
        url TEXT NULL,
        perms TEXT NULL,
        type TEXT NULL,
        icon TEXT NULL,
        sort INTEGER NULL,
        create_by INTEGER NULL,
        create_time TIMESTAMP NULL,
        update_by INTEGER NULL,
        update_time TIMESTAMP NULL,
        CONSTRAINT PK_SYS_MENU PRIMARY KEY (id)
    );
COMMENT ON TABLE tb_menu
IS
    '菜单表';
COMMENT ON column tb_menu.id
IS
    'ID';
COMMENT ON column tb_menu.menu_name
IS
    '菜单名称';
COMMENT ON column tb_menu.parent_id
IS
    '父菜单ID，一级菜单为0';
COMMENT ON column tb_menu.url
IS
    '菜单URL';
COMMENT ON column tb_menu.perms
IS
    '授权(多个用逗号分隔，如：user:list,user:create)';
COMMENT ON column tb_menu.type
IS
    '类型   0：目录   1：菜单   2：按钮';
COMMENT ON column tb_menu.icon
IS
    '菜单图标';
COMMENT ON column tb_menu.sort
IS
    '排序';
COMMENT ON column tb_menu.create_by
IS
    '创建用户';
COMMENT ON column tb_menu.create_time
IS
    '创建时间';
COMMENT ON column tb_menu.update_by
IS
    '修改用户';
COMMENT ON column tb_menu.update_time
IS
    '修改时间';

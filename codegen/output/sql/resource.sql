delete from `t_sys_resource` where url = 'admin/glass/list';
insert into `t_sys_resource` (`id`, `name`, `url`, `pid`, `summary`, `res_order`, `create_date`, `update_date`) values
('627fb2e1232d46c2831d8fabdef5508f','书籍','admin/glass/list',NULL,NULL,NULL,sysdate(),sysdate());

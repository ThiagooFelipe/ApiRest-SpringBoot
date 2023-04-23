alter table medicos add ativo tinyint null;
update medicos set ativo = 1;
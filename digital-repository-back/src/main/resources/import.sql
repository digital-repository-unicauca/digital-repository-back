-- Vendor
INSERT INTO `vendor` (`id`, `createTime`, `createUser`, `identification`, `name`, `updateTime`, `updateUser`) VALUES (NULL, '2023-05-27 17:13:42', 'Miguel', '1061', 'Andres', '2023-05-27 17:13:42', NULL);

-- Modality
INSERT INTO `modality` (`id`, `createTime`, `createUser`, `description`, `externalCode`, `name`, `updateTime`, `updateUser`) VALUES (NULL, '2023-05-27 18:23:39', 'Miguel', 'Contratos que superan los 50 Millones de pesos', '123C', '+ 50 Millones', '2023-05-27 18:23:39', NULL);

-- ContractTyp
INSERT INTO `contracttype` (`id`, `createTime`, `createUser`, `description`, `externalCode`, `name`, `updateTime`, `updateUser`) VALUES (NULL, '2023-05-27 18:26:17', 'Miguel', 'Contratos de prestación de servicios es decir OPS', '123C', 'Prestación de Servicios', '2023-05-27 18:26:17', NULL);

-- ModalityContractType
INSERT INTO `modalitycontracttype` (`id`, `createTime`, `createUser`, `updateTime`, `updateUser`, `modalityId`, `contractTypeId`) VALUES (NULL, '2023-05-27 18:27:30', 'Miguel', '2023-05-27 18:27:30', NULL, 1, 1);

-- Contract
INSERT INTO `contract` (`id`, `createTime`, `createUser`, `finalDate`, `initialDate`, `reference`, `signingDate`, `status`, `subject`, `updateTime`, `updateUser`, `vendorId`, `modalityContractTypeId`) VALUES (NULL, '2023-05-27 15:50:41', 'Miguel', '2024-05-01 15:48:41', '2023-05-30 15:48:41', 'xxx.yyy.zzz.1', '2023-05-27 15:48:41', 'ACTIVO', 'Gastar el dinero de la U', '2023-05-27 15:50:41', NULL, 1, 1);
INSERT INTO `contract` (`id`, `createTime`, `createUser`, `finalDate`, `initialDate`, `reference`, `signingDate`, `status`, `subject`, `updateTime`, `updateUser`, `vendorId`, `modalityContractTypeId`) VALUES (NULL, '2023-06-27 15:50:41', 'Miguel', '2024-05-01 15:48:41', '2023-05-30 15:48:41', 'xxx.yyy.zzz.2', '2023-05-27 15:48:41', 'ACTIVO', 'Gastar el dinero de la U', '2023-06-27 15:50:41', NULL, 1, 1);
INSERT INTO `contract` (`id`, `createTime`, `createUser`, `finalDate`, `initialDate`, `reference`, `signingDate`, `status`, `subject`, `updateTime`, `updateUser`, `vendorId`, `modalityContractTypeId`) VALUES (NULL, '2023-07-27 15:50:41', 'Miguel', '2024-05-01 15:48:41', '2023-05-30 15:48:41', 'xxx.yyy.zzz.3', '2023-05-27 15:48:41', 'ACTIVO', 'Gastar el dinero de la U', '2023-07-27 15:50:41', NULL, 1, 1);
INSERT INTO `contract` (`id`, `createTime`, `createUser`, `finalDate`, `initialDate`, `reference`, `signingDate`, `status`, `subject`, `updateTime`, `updateUser`, `vendorId`, `modalityContractTypeId`) VALUES (NULL, '2024-05-27 15:50:41', 'Miguel', '2024-05-01 15:48:41', '2023-05-30 15:48:41', 'xxx.yyy.zzz.4', '2023-01-27 15:48:41', 'ACTIVO', 'Gastar el dinero de la U', '2024-05-27 15:50:41', NULL, 1, 1);
INSERT INTO `contract` (`id`, `createTime`, `createUser`, `finalDate`, `initialDate`, `reference`, `signingDate`, `status`, `subject`, `updateTime`, `updateUser`, `vendorId`, `modalityContractTypeId`) VALUES (NULL, '2024-06-27 15:50:41', 'Miguel', '2024-05-01 15:48:41', '2023-05-30 15:48:41', 'xxx.yyy.zzz.5', '2023-05-27 15:48:41', 'ACTIVO', 'Gastar el dinero de la U', '2024-06-27 15:50:41', NULL, 1, 1);
INSERT INTO `contract` (`id`, `createTime`, `createUser`, `finalDate`, `initialDate`, `reference`, `signingDate`, `status`, `subject`, `updateTime`, `updateUser`, `vendorId`, `modalityContractTypeId`) VALUES (NULL, '2024-07-27 15:50:41', 'Miguel', '2024-05-01 15:48:41', '2023-05-30 15:48:41', 'xxx.yyy.zzz.6', '2023-05-27 15:48:41', 'ACTIVO', 'Gastar el dinero de la U', '2024-07-27 15:50:41', NULL, 1, 1);


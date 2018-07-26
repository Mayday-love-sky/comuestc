CREATE TABLE `Activity` (
`actID` int(11) NOT NULL AUTO_INCREMENT,
`actName` varchar(255) NOT NULL,
`actDescription` varchar(255) NOT NULL,
`actOwner` int(11) NOT NULL,
`actCreateTime` timestamp(6) NOT NULL,
`actGroupID` int(11) NOT NULL,
PRIMARY KEY (`actID`) ,
INDEX `FK_activity_groupID` (`actGroupID` ASC) USING BTREE,
INDEX `FK_activity_userID` (`actOwner` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 0
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Dynamic;

CREATE TABLE `Group` (
`groupID` int(11) NOT NULL AUTO_INCREMENT,
`groupName` varchar(255) NOT NULL,
`groupOwner` int(11) NOT NULL,
`groupType` varchar(10) NOT NULL,
`groupDescripation` varchar(255) NULL DEFAULT NULL,
`groupCreateTime` timestamp(6) NOT NULL,
PRIMARY KEY (`groupID`) ,
INDEX `FK_group_userID` (`groupOwner` ASC) USING BTREE
)
ENGINE = InnoDB
AUTO_INCREMENT = 0
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Dynamic;
CREATE TABLE `User` (
`userID` int(11) NOT NULL AUTO_INCREMENT,
`userAccount` int(11) NOT NULL,
`userPhone` char(11) NULL DEFAULT NULL,
`userEmail` varchar(255) NULL DEFAULT NULL,
`userPassword` varchar(30) NOT NULL,
`userCreateTime` timestamp(6) NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP(6),
PRIMARY KEY (`userID`) 
)
ENGINE = InnoDB
AUTO_INCREMENT = 15
AVG_ROW_LENGTH = 0
DEFAULT CHARACTER SET = utf8
COLLATE = utf8_general_ci
KEY_BLOCK_SIZE = 0
MAX_ROWS = 0
MIN_ROWS = 0
ROW_FORMAT = Dynamic;
CREATE TABLE `UserGroup` (
`UGgroupID` int(11) NOT NULL,
`UGuserID` int(11) NOT NULL,
`userJoinTime` timestamp(6) NOT NULL,
`userType` varchar(255) NULL,
PRIMARY KEY (`UGgroupID`, `UGuserID`) 
);
CREATE TABLE `UserActivity` (
`UAactID` int(11) NOT NULL,
`UAuserID` int(11) NOT NULL,
`userActJoinTime` timestamp(6) NOT NULL,
`userActType` varchar(255) NOT NULL,
PRIMARY KEY (`UAactID`, `UAuserID`) 
);
CREATE TABLE `UserLog` (
`ULuserID` int(11) NOT NULL,
`userLoginTime` timestamp(6) NOT NULL,
`userIpAddress` varchar(255) NOT NULL,
PRIMARY KEY (`ULuserID`) 
);
CREATE TABLE `UserInfo` (
`UIuserID` int(11) NOT NULL,
`userName` varchar(255) NULL,
`userTrueName` varchar(255) NULL,
`userBirthday` timestamp(6) NULL,
`userSex` varchar(255) NULL,
`userSchool` varchar(255) NULL,
`userEnterSchoolTime` timestamp(6) NULL,
`userMajor` varchar(255) NULL,
PRIMARY KEY (`UIuserID`) 
);

ALTER TABLE `Activity` ADD CONSTRAINT `FK_activity_groupID` FOREIGN KEY (`actGroupID`) REFERENCES `Group` (`groupID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `Activity` ADD CONSTRAINT `FK_activity_userID` FOREIGN KEY (`actOwner`) REFERENCES `User` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `Group` ADD CONSTRAINT `FK_group_userID` FOREIGN KEY (`groupOwner`) REFERENCES `User` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `UserGroup` ADD CONSTRAINT `fk_UserGroup_groupID` FOREIGN KEY (`UGgroupID`) REFERENCES `Group` (`groupID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `UserGroup` ADD CONSTRAINT `fk_UserGroup_userID` FOREIGN KEY (`UGuserID`) REFERENCES `User` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `UserActivity` ADD CONSTRAINT `fk_UserActivity_actID` FOREIGN KEY (`UAactID`) REFERENCES `Activity` (`actID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `UserActivity` ADD CONSTRAINT `fk_UserActivity_userID` FOREIGN KEY (`UAuserID`) REFERENCES `User` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `UserInfo` ADD CONSTRAINT `fk_UserInfo_userID` FOREIGN KEY (`UIuserID`) REFERENCES `User` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;
ALTER TABLE `UserLog` ADD CONSTRAINT `fk_UserLog_userID` FOREIGN KEY (`ULuserID`) REFERENCES `User` (`userID`) ON DELETE CASCADE ON UPDATE CASCADE;


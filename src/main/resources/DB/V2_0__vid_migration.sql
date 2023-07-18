create table if not exists 'Videos'
(
    title       text,
    ID          text,
    views       int,
    likes       int,
    comments    int,
    scannedDate datetime,
    ChanID      INTEGER
        constraint Videos_Channels_ID_fk
            references Channels,
    GoogleVidID integer
);
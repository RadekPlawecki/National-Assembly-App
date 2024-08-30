import React from "react";
import DashboardIcon from '@mui/icons-material/Dashboard';
import QuestionAnswerIcon from '@mui/icons-material/QuestionAnswer';
import EmojiObjectsIcon from '@mui/icons-material/EmojiObjects';
import HowToVoteIcon from '@mui/icons-material/HowToVote';
import CampaignIcon from '@mui/icons-material/Campaign';

export const SidebarData = [
    {
        title: "Dashboard",
        icon: <DashboardIcon />,
        link: "/dashboard"
    },
    {
        title: "Speakers' list",
        icon: <QuestionAnswerIcon />,
        link: "/speakers_list"
    },
    {
        title: "Opportunities",
        icon: <EmojiObjectsIcon />,
        link: "/opportunities"
    },
    {
        title: "Voting",
        icon: <HowToVoteIcon />,
        link: "/voting"
    },
    {
        title: "Candidacies",
        icon: <CampaignIcon />,
        link: "/candidacies"
    }
]
package com.onarandombox.multiverseinventories.profile.container;

import org.bukkit.OfflinePlayer;

/**
 * A utility for storing and retrieving profile containers.
 */
public interface ProfileContainerStore {

    /**
     * Adds a profile container to the store.
     *
     * @param container profile container to add.
     */
    void addContainer(ProfileContainer container);

    /**
     * Remove a profile container from the store
     *
     * @param containerName Name of the profile container to retrieve
     */
    void removeContainer(String containerName);

    /**
     * Returns the profile container for the given name.
     *
     * @param containerName Name of the profile container to retrieve.
     * @return the profile container for given name.
     */
    ProfileContainer getContainer(String containerName);

    void unloadAllProfile(OfflinePlayer player);
}


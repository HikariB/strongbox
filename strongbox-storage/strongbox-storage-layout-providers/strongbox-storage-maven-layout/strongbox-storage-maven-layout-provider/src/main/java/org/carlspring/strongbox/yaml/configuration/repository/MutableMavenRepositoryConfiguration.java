package org.carlspring.strongbox.yaml.configuration.repository;

import org.carlspring.strongbox.providers.layout.Maven2LayoutProvider;
import org.carlspring.strongbox.yaml.repository.CustomRepositoryConfiguration;
import org.carlspring.strongbox.yaml.repository.MutableCustomRepositoryConfiguration;

import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * @author carlspring
 * @author Pablo Tirado
 */
@JsonTypeName(Maven2LayoutProvider.ALIAS)
public class MutableMavenRepositoryConfiguration
        extends MutableCustomRepositoryConfiguration
{

    private boolean indexingEnabled = false;

    private boolean indexingClassNamesEnabled = true;

    public boolean isIndexingEnabled()
    {
        return indexingEnabled;
    }

    public void setIndexingEnabled(boolean indexingEnabled)
    {
        this.indexingEnabled = indexingEnabled;
    }

    public boolean isIndexingClassNamesEnabled()
    {
        return indexingClassNamesEnabled;
    }

    public void setIndexingClassNamesEnabled(final boolean indexingClassNamesEnabled)
    {
        this.indexingClassNamesEnabled = indexingClassNamesEnabled;
    }

    @Override
    public CustomRepositoryConfiguration getImmutable()
    {
        return new MavenRepositoryConfiguration(this);
    }
}

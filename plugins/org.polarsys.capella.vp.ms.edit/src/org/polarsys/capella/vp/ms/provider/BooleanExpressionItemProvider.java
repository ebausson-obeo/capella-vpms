/*******************************************************************************
 * Copyright (c) 2017, 2020 THALES GLOBAL SERVICES.
 *  
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales - initial API and implementation
 *    Altran - Compare Configurations
 *******************************************************************************/

package org.polarsys.capella.vp.ms.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.CommandParameter;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.polarsys.capella.common.data.modellingcore.ModellingcorePackage;
import org.polarsys.capella.common.data.modellingcore.provider.ModelElementItemProvider;
import org.polarsys.capella.core.data.capellacore.CapellacoreFactory;
import org.polarsys.capella.core.data.capellacore.CapellacorePackage;
import org.polarsys.capella.vp.ms.BooleanExpression;
import org.polarsys.capella.vp.ms.MsFactory;
import org.polarsys.capella.vp.ms.MsPackage;
import org.polarsys.kitalpha.emde.extension.ExtensionModelManager;
import org.polarsys.kitalpha.emde.extension.ModelExtensionHelper;
import org.polarsys.kitalpha.emde.model.EmdePackage;
import org.polarsys.kitalpha.emde.model.edit.provider.NewChildDescriptorHelper;

/**
 * This is the item provider adapter for a {@link org.polarsys.capella.vp.ms.ms.BooleanExpression} object. <!--
 * begin-user-doc -->
 * 
 * @superClass ExtensionItemProviderAdapter <!-- end-user-doc -->
 * @generated
 */
public class BooleanExpressionItemProvider extends ModelElementItemProvider implements IEditingDomainItemProvider,
    IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected IItemPropertyDescriptor statusPropertyDescriptor;

  /**
   * This constructs an instance from a factory and a notifier. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  public BooleanExpressionItemProvider(AdapterFactory adapterFactory) {
    super(adapterFactory);
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void checkChildCreationExtender(Object object) {
    super.checkChildCreationExtender(object);
    if (object instanceof EObject) {
      EObject eObject = (EObject) object;
      // Process CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS
      if (statusPropertyDescriptor != null) {
        Object statusValue = eObject.eGet(CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS, true);
        if (statusValue != null && statusValue instanceof EObject
            && ModelExtensionHelper.getInstance(eObject).isExtensionModelDisabled((EObject) statusValue)) {
          itemPropertyDescriptors.remove(statusPropertyDescriptor);
        } else if (statusValue == null
            && ExtensionModelManager.getAnyType(eObject, CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS) != null) {
          itemPropertyDescriptors.remove(statusPropertyDescriptor);
        } else if (itemPropertyDescriptors.contains(statusPropertyDescriptor) == false) {
          itemPropertyDescriptors.add(statusPropertyDescriptor);
        }
      }
    }
  }

  /**
   * This returns the property descriptors for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
    if (itemPropertyDescriptors == null) {
      super.getPropertyDescriptors(object);

      addIncomingTracesPropertyDescriptor(object);
      addOutgoingTracesPropertyDescriptor(object);
      addVisibleInDocPropertyDescriptor(object);
      addVisibleInLMPropertyDescriptor(object);
      addSummaryPropertyDescriptor(object);
      addDescriptionPropertyDescriptor(object);
      addReviewPropertyDescriptor(object);
      addAppliedPropertyValuesPropertyDescriptor(object);
      addAppliedPropertyValueGroupsPropertyDescriptor(object);
      addStatusPropertyDescriptor(object);
      addFeaturesPropertyDescriptor(object);
      addAppliedRequirementsPropertyDescriptor(object);
    }
    // begin-extension-code
    checkChildCreationExtender(object);
    // end-extension-code
    return itemPropertyDescriptors;
  }

  /**
   * This adds a property descriptor for the Incoming Traces feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addIncomingTracesPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TraceableElement_incomingTraces_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_TraceableElement_incomingTraces_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_TraceableElement_type"), //$NON-NLS-1$
        ModellingcorePackage.Literals.TRACEABLE_ELEMENT__INCOMING_TRACES, false, false, false, null, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Outgoing Traces feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addOutgoingTracesPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_TraceableElement_outgoingTraces_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_TraceableElement_outgoingTraces_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_TraceableElement_type"), //$NON-NLS-1$
        ModellingcorePackage.Literals.TRACEABLE_ELEMENT__OUTGOING_TRACES, false, false, false, null, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Visible In Doc feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addVisibleInDocPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_PublishableElement_visibleInDoc_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_PublishableElement_visibleInDoc_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_PublishableElement_type"), //$NON-NLS-1$
        ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_DOC, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Visible In LM feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addVisibleInLMPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_PublishableElement_visibleInLM_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_PublishableElement_visibleInLM_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_PublishableElement_type"), //$NON-NLS-1$
        ModellingcorePackage.Literals.PUBLISHABLE_ELEMENT__VISIBLE_IN_LM, true, false, false,
        ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Summary feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addSummaryPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_summary_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_summary_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_CapellaElement_type"), //$NON-NLS-1$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__SUMMARY, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Description feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addDescriptionPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_description_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_description_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_CapellaElement_type"), //$NON-NLS-1$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__DESCRIPTION, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Review feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addReviewPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_review_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_review_feature", "_UI_CapellaElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__REVIEW, true, false, false,
        ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Applied Property Values feature. <!-- begin-user-doc --> <!-- end-user-doc
   * -->
   * 
   * @generated
   */
  protected void addAppliedPropertyValuesPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_appliedPropertyValues_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_appliedPropertyValues_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_CapellaElement_type"), //$NON-NLS-1$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUES, true, false, true, null, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Applied Property Value Groups feature. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  protected void addAppliedPropertyValueGroupsPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_appliedPropertyValueGroups_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_appliedPropertyValueGroups_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_CapellaElement_type"), //$NON-NLS-1$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_PROPERTY_VALUE_GROUPS, true, false, true, null, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Status feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addStatusPropertyDescriptor(Object object) {
    // begin-extension-code
    statusPropertyDescriptor = createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_status_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_status_feature", "_UI_CapellaElement_type"), //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__STATUS, true, false, true, null, null,
        // begin-extension-code
        null);
    itemPropertyDescriptors.add(statusPropertyDescriptor);
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Features feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addFeaturesPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_features_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_features_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_CapellaElement_type"), //$NON-NLS-1$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__FEATURES, true, false, true, null, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This adds a property descriptor for the Applied Requirements feature. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  protected void addAppliedRequirementsPropertyDescriptor(Object object) {

    // begin-extension-code
    itemPropertyDescriptors.add(createItemPropertyDescriptor
    // end-extension-code
    (((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
        getString("_UI_CapellaElement_appliedRequirements_feature"), //$NON-NLS-1$
        getString("_UI_PropertyDescriptor_description", "_UI_CapellaElement_appliedRequirements_feature", //$NON-NLS-1$ //$NON-NLS-2$
            "_UI_CapellaElement_type"), //$NON-NLS-1$
        CapellacorePackage.Literals.CAPELLA_ELEMENT__APPLIED_REQUIREMENTS, false, false, false, null, null,
        // begin-extension-code
        null));
    // end-extension-code
  }

  /**
   * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
   * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
   * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}. <!-- begin-user-doc --> <!--
   * end-user-doc -->
   * 
   * @generated
   */
  @Override
  public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
    if (childrenFeatures == null) {
      super.getChildrenFeatures(object);
      childrenFeatures.add(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES);
      childrenFeatures.add(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES);
      childrenFeatures.add(CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS);
    }
    return childrenFeatures;
  }

  /**
   * <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected EStructuralFeature getChildFeature(Object object, Object child) {
    // Check the type of the specified child object and return the proper feature to use for
    // adding (see {@link AddCommand}) it as a child.

    return super.getChildFeature(object, child);
  }

  /**
   * This returns the label text for the adapted class. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public String getText(Object object) {

    String label = ((BooleanExpression) object).getId();
    // begin-extension-code
    return label == null || label.length() == 0 ? "[" + getString("_UI_BooleanExpression_type") + "]" : label; //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
    // end-extension-code
  }

  /**
   * This handles model notifications by calling {@link #updateChildren} to update any cached children and by creating a
   * viewer notification, which it passes to {@link #fireNotifyChanged}. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  public void notifyChanged(Notification notification) {
    updateChildren(notification);

    switch (notification.getFeatureID(BooleanExpression.class)) {
    case MsPackage.BOOLEAN_EXPRESSION__VISIBLE_IN_DOC:
    case MsPackage.BOOLEAN_EXPRESSION__VISIBLE_IN_LM:
    case MsPackage.BOOLEAN_EXPRESSION__SUMMARY:
    case MsPackage.BOOLEAN_EXPRESSION__DESCRIPTION:
    case MsPackage.BOOLEAN_EXPRESSION__REVIEW:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
      return;
    case MsPackage.BOOLEAN_EXPRESSION__OWNED_PROPERTY_VALUES:
    case MsPackage.BOOLEAN_EXPRESSION__OWNED_ENUMERATION_PROPERTY_TYPES:
    case MsPackage.BOOLEAN_EXPRESSION__OWNED_PROPERTY_VALUE_GROUPS:
      fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
      return;
    }
    super.notifyChanged(notification);
  }

  /**
   * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children that can be created under
   * this object. <!-- begin-user-doc --> <!-- end-user-doc -->
   * 
   * @generated
   */
  @Override
  protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
    super.collectNewChildDescriptors(newChildDescriptors, object);
    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, MsFactory.eINSTANCE.createCSConfiguration());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, MsFactory.eINSTANCE.createFSMType());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, MsFactory.eINSTANCE.createSituation());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, MsFactory.eINSTANCE.createComparison());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          EmdePackage.Literals.EXTENSIBLE_ELEMENT__OWNED_EXTENSIONS, MsFactory.eINSTANCE.createResult());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          ModellingcorePackage.Literals.MODEL_ELEMENT__OWNED_CONSTRAINTS,
          CapellacoreFactory.eINSTANCE.createConstraint());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
          CapellacoreFactory.eINSTANCE.createStringPropertyValue());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
          CapellacoreFactory.eINSTANCE.createIntegerPropertyValue());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
          CapellacoreFactory.eINSTANCE.createBooleanPropertyValue());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
          CapellacoreFactory.eINSTANCE.createFloatPropertyValue());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUES,
          CapellacoreFactory.eINSTANCE.createEnumerationPropertyValue());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_ENUMERATION_PROPERTY_TYPES,
          CapellacoreFactory.eINSTANCE.createEnumerationPropertyType());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

    // begin-extension-code
    {
      CommandParameter commandParameter = createChildParameter(
          CapellacorePackage.Literals.CAPELLA_ELEMENT__OWNED_PROPERTY_VALUE_GROUPS,
          CapellacoreFactory.eINSTANCE.createPropertyValueGroup());
      if (NewChildDescriptorHelper.isValidCommand(object, commandParameter)) {
        newChildDescriptors.add(commandParameter);
      }
    }
    // end-extension-code

  }

  @Override
  public Object getCreateChildImage(Object owner, Object feature, Object child, Collection<?> selection) {
    IItemLabelProvider childProvider = (IItemLabelProvider) ((ComposeableAdapterFactory) getAdapterFactory())
        .getRootAdapterFactory().adapt(child, IItemLabelProvider.class);
    if (childProvider != null) {
      return childProvider.getImage(child);
    }
    return null;
  }

}
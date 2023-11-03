/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package store.impl;

import javax.activation.DataHandler;

import org.bimserver.models.geometry.GeometryPackage;

import org.bimserver.models.geometry.impl.GeometryPackageImpl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;

import org.bimserver.models.ifc2x3tc1.impl.Ifc2x3tc1PackageImpl;

import org.bimserver.models.ifc4.Ifc4Package;

import org.bimserver.models.ifc4.impl.Ifc4PackageImpl;

import org.bimserver.models.ifc4x3.Ifc4x3Package;

import org.bimserver.models.ifc4x3.impl.Ifc4x3PackageImpl;

import org.bimserver.models.log.LogPackage;

import org.bimserver.models.log.impl.LogPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import store.Action;
import store.ActionState;
import store.ArrayDefinition;
import store.ArrayType;
import store.Authorization;
import store.BimServerInfo;
import store.BooleanType;
import store.ByteArrayType;
import store.CheckinRevision;
import store.Checkout;
import store.CheckoutResult;
import store.CompareContainer;
import store.CompareItem;
import store.CompareResult;
import store.CompareType;
import store.ConcreteRevision;
import store.DataObject;
import store.DataValue;
import store.DatabaseInformation;
import store.DatabaseInformationCategory;
import store.DatabaseInformationItem;
import store.Density;
import store.DensityCollection;
import store.DeserializerPluginConfiguration;
import store.DoubleType;
import store.DownloadResult;
import store.ExtendedData;
import store.ExtendedDataSchema;
import store.File;
import store.FormatSerializerMap;
import store.GeoTag;
import store.IfcHeader;
import store.ImmediateNotificationResult;
import store.InterfaceMetric;
import store.InternalServicePluginConfiguration;
import store.JavaInfo;
import store.ListDataValue;
import store.LongAction;
import store.LongActionState;
import store.LongCheckinActionState;
import store.LongType;
import store.MessagingSerializerPluginConfiguration;
import store.MethodMetric;
import store.Metrics;
import store.Migration;
import store.ModelCheckerInstance;
import store.ModelCheckerResult;
import store.ModelCheckerResultHeader;
import store.ModelCheckerResultItem;
import store.ModelCheckerResultLine;
import store.ModelCheckerResultType;
import store.ModelComparePluginConfiguration;
import store.ModelMergerPluginConfiguration;
import store.NewService;
import store.NewServiceDescriptor;
import store.NotifictionResultEnum;
import store.OAuthAuthorizationCode;
import store.OAuthServer;
import store.ObjectAdded;
import store.ObjectDefinition;
import store.ObjectIDMPluginConfiguration;
import store.ObjectIDMPluginDescriptor;
import store.ObjectModified;
import store.ObjectRemoved;
import store.ObjectState;
import store.ObjectType;
import store.Parameter;
import store.ParameterDefinition;
import store.PercentageChange;
import store.PluginBundle;
import store.PluginBundleType;
import store.PluginBundleVersion;
import store.PluginConfiguration;
import store.PluginDescriptor;
import store.PluginInformation;
import store.PluginType;
import store.PrimitiveDefinition;
import store.PrimitiveEnum;
import store.PrimitiveType;
import store.ProfileDescriptor;
import store.ProgressTopicType;
import store.Project;
import store.ProjectSmall;
import store.QueryEnginePluginConfiguration;
import store.ReferenceDataValue;
import store.RemoteServiceUpdate;
import store.RenderEnginePluginConfiguration;
import store.Revision;
import store.RevisionSummary;
import store.RevisionSummaryContainer;
import store.RevisionSummaryType;
import store.RunServiceAuthorization;
import store.SIPrefix;
import store.SerializerPluginConfiguration;
import store.ServerInfo;
import store.ServerSettings;
import store.ServerState;
import store.Service;
import store.ServiceDescriptor;
import store.ServiceField;
import store.ServiceInterface;
import store.ServiceMethod;
import store.ServiceParameter;
import store.ServiceSimpleType;
import store.ServiceStatus;
import store.ServiceType;
import store.SimpleDataValue;
import store.SingleProjectAuthorization;
import store.SmtpProtocol;
import store.StoreExtendedData;
import store.StoreFactory;
import store.StorePackage;
import store.StringType;
import store.SystemInfo;
import store.Tile;
import store.Token;
import store.Trigger;
import store.Type;
import store.TypeDefinition;
import store.User;
import store.UserSession;
import store.UserSettings;
import store.UserType;
import store.Version;
import store.WebModulePluginConfiguration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class StorePackageImpl extends EPackageImpl implements StorePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concreteRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass geoTagEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkoutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSettingsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serializerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIDMPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderEnginePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deserializerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass downloadResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkoutResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userSessionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass migrationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInformationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInformationCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass databaseInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionSummaryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionSummaryContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionSummaryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectIDMPluginDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectAddedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectRemovedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectModifiedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compareResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longActionStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serverInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedDataSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extendedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryEnginePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass webModulePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelMergerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelComparePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass profileDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass internalServicePluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceMethodEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass primitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass byteArrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass doubleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass immediateNotificationResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass remoteServiceUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass percentageChangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass javaInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bimServerInfoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectSmallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ifcHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerResultItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerResultHeaderEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerResultLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerResultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelCheckerInstanceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messagingSerializerPluginConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass metricsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass methodMetricEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginBundleVersionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginBundleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pluginInformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthServerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass oAuthAuthorizationCodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleProjectAuthorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newServiceDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formatSerializerMapEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass storeExtendedDataEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass checkinRevisionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass runServiceAuthorizationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass densityCollectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass densityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass longCheckinActionStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siPrefixEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum objectStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compareTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serverStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum triggerEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceSimpleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primitiveEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum notifictionResultEnumEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum progressTopicTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum modelCheckerResultTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smtpProtocolEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pluginBundleTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pluginTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dataHandlerEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see store.StorePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private StorePackageImpl() {
		super(eNS_URI, StoreFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link StorePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static StorePackage init() {
		if (isInited)
			return (StorePackage) EPackage.Registry.INSTANCE.getEPackage(StorePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredStorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		StorePackageImpl theStorePackage = registeredStorePackage instanceof StorePackageImpl
				? (StorePackageImpl) registeredStorePackage
				: new StorePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(GeometryPackage.eNS_URI);
		GeometryPackageImpl theGeometryPackage = (GeometryPackageImpl) (registeredPackage instanceof GeometryPackageImpl
				? registeredPackage
				: GeometryPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc2x3tc1Package.eNS_URI);
		Ifc2x3tc1PackageImpl theIfc2x3tc1Package = (Ifc2x3tc1PackageImpl) (registeredPackage instanceof Ifc2x3tc1PackageImpl
				? registeredPackage
				: Ifc2x3tc1Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc4Package.eNS_URI);
		Ifc4PackageImpl theIfc4Package = (Ifc4PackageImpl) (registeredPackage instanceof Ifc4PackageImpl
				? registeredPackage
				: Ifc4Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(Ifc4x3Package.eNS_URI);
		Ifc4x3PackageImpl theIfc4x3Package = (Ifc4x3PackageImpl) (registeredPackage instanceof Ifc4x3PackageImpl
				? registeredPackage
				: Ifc4x3Package.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI);
		LogPackageImpl theLogPackage = (LogPackageImpl) (registeredPackage instanceof LogPackageImpl ? registeredPackage
				: LogPackage.eINSTANCE);

		// Load packages
		theGeometryPackage.loadPackage();
		theIfc2x3tc1Package.loadPackage();
		theIfc4Package.loadPackage();
		theIfc4x3Package.loadPackage();
		theLogPackage.loadPackage();

		// Create package meta-data objects
		theStorePackage.createPackageContents();

		// Initialize created meta-data
		theStorePackage.initializePackageContents();

		// Fix loaded packages
		theGeometryPackage.fixPackageContents();
		theIfc2x3tc1Package.fixPackageContents();
		theIfc4Package.fixPackageContents();
		theIfc4x3Package.fixPackageContents();
		theLogPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theStorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(StorePackage.eNS_URI, theStorePackage);
		return theStorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Id() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Name() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_HasAuthorizedUsers() {
		return (EReference) projectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ConcreteRevisions() {
		return (EReference) projectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Revisions() {
		return (EReference) projectEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_LastConcreteRevision() {
		return (EReference) projectEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_LastRevision() {
		return (EReference) projectEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Checkouts() {
		return (EReference) projectEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_State() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CreatedDate() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_CreatedBy() {
		return (EReference) projectEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_GeoTag() {
		return (EReference) projectEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_SubProjects() {
		return (EReference) projectEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Parent() {
		return (EReference) projectEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Description() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_ExportLengthMeasurePrefix() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ExtendedData() {
		return (EReference) projectEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Services() {
		return (EReference) projectEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_Logs() {
		return (EReference) projectEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_ModelCheckers() {
		return (EReference) projectEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_Schema() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_SendEmailOnNewRevision() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getProject_NewServices() {
		return (EReference) projectEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProject_CheckinInProgress() {
		return (EAttribute) projectEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Name() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_PasswordHash() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_PasswordSalt() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_HasRightsOn() {
		return (EReference) userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_State() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_CreatedOn() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_CreatedBy() {
		return (EReference) userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_UserType() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Username() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_LastSeen() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_Token() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_ValidationToken() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUser_ValidationTokenCreated() {
		return (EAttribute) userEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_UserSettings() {
		return (EReference) userEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Schemas() {
		return (EReference) userEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_ExtendedData() {
		return (EReference) userEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Services() {
		return (EReference) userEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_Logs() {
		return (EReference) userEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_OAuthAuthorizationCodes() {
		return (EReference) userEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUser_OAuthIssuedAuthorizationCodes() {
		return (EReference) userEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevision() {
		return revisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Id() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_User() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Date() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Comment() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Size() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_ConcreteRevisions() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_LastConcreteRevision() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Checkouts() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Project() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Tag() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_LastError() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_Bmi() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_ExtendedData() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Logs() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Service() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_HasGeometry() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_Bounds() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_BoundsUntransformed() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_BoundsMm() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_BoundsUntransformedMm() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_ServicesLinked() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevision_DensityCollection() {
		return (EReference) revisionEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevision_NrPrimitives() {
		return (EAttribute) revisionEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcreteRevision() {
		return concreteRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_Id() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_Project() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_Checksum() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_Revisions() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_Size() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_Date() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_LastError() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_Clear() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_Summary() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_User() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_IfcHeader() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_Bounds() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_BoundsUntransformed() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_OidCounters() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcreteRevision_MultiplierToMm() {
		return (EAttribute) concreteRevisionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcreteRevision_DensityCollection() {
		return (EReference) concreteRevisionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGeoTag() {
		return geoTagEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTag_Enabled() {
		return (EAttribute) geoTagEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGeoTag_Projects() {
		return (EReference) geoTagEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTag_X() {
		return (EAttribute) geoTagEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTag_Y() {
		return (EAttribute) geoTagEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTag_Z() {
		return (EAttribute) geoTagEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTag_Epsg() {
		return (EAttribute) geoTagEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGeoTag_DirectionAngle() {
		return (EAttribute) geoTagEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckout() {
		return checkoutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckout_User() {
		return (EReference) checkoutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckout_Revision() {
		return (EReference) checkoutEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckout_Project() {
		return (EReference) checkoutEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckout_Date() {
		return (EAttribute) checkoutEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckout_Checkin() {
		return (EReference) checkoutEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCheckout_Active() {
		return (EAttribute) checkoutEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckout_Logs() {
		return (EReference) checkoutEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerSettings() {
		return serverSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SendConfirmationEmailAfterRegistration() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_AllowSelfRegistration() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_AllowUsersToCreateTopLevelProjects() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_CheckinMergingEnabled() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SmtpServer() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_EmailSenderAddress() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_EmailSenderName() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SiteAddress() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_GenerateGeometryOnCheckin() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_AllowOnlyWhitelisted() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_WhitelistedDomains() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_HideUserListForNonAdmin() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_ProtocolBuffersPort() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_CacheOutputFiles() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerSettings_WebModules() {
		return (EReference) serverSettingsEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerSettings_WebModule() {
		return (EReference) serverSettingsEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_ServiceRepositoryUrl() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SendEmailOnNewRevision() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SessionTimeOutSeconds() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SmtpUsername() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SmtpPassword() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SmtpPort() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_SmtpProtocol() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_ReuseGeometry() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_AllowCreateValidatedUser() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_RenderEngineProcesses() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_PluginStrictVersionChecking() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Name() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Description() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_Icon() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_StoreLastLogin() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_StoreServiceRuns() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerSettings_OptimizeMappedItems() {
		return (EAttribute) serverSettingsEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerSettings_DefaultRenderEnginePlugin() {
		return (EReference) serverSettingsEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserSettings() {
		return userSettingsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_Serializers() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_ObjectIDMs() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_RenderEngines() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_Deserializers() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_QueryEngines() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_ModelMergers() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_ModelCompares() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_DefaultModelMerger() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_DefaultModelCompare() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_DefaultQueryEngine() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_DefaultRenderEngine() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_DefaultSerializer() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_DefaultObjectIDM() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSettings_Services() {
		return (EReference) userSettingsEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginConfiguration() {
		return pluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginConfiguration_Name() {
		return (EAttribute) pluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginConfiguration_Enabled() {
		return (EAttribute) pluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginConfiguration_Description() {
		return (EAttribute) pluginConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginConfiguration_PluginDescriptor() {
		return (EReference) pluginConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginConfiguration_Settings() {
		return (EReference) pluginConfigurationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSerializerPluginConfiguration() {
		return serializerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSerializerPluginConfiguration_ObjectIDM() {
		return (EReference) serializerPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSerializerPluginConfiguration_UserSettings() {
		return (EReference) serializerPluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSerializerPluginConfiguration_RenderEngine() {
		return (EReference) serializerPluginConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSerializerPluginConfiguration_Streaming() {
		return (EAttribute) serializerPluginConfigurationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectIDMPluginConfiguration() {
		return objectIDMPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectIDMPluginConfiguration_Serializers() {
		return (EReference) objectIDMPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectIDMPluginConfiguration_UserSettings() {
		return (EReference) objectIDMPluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRenderEnginePluginConfiguration() {
		return renderEnginePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenderEnginePluginConfiguration_Serializers() {
		return (EReference) renderEnginePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRenderEnginePluginConfiguration_UserSettings() {
		return (EReference) renderEnginePluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeserializerPluginConfiguration() {
		return deserializerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDeserializerPluginConfiguration_UserSettings() {
		return (EReference) deserializerPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDownloadResult() {
		return downloadResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDownloadResult_ProjectName() {
		return (EAttribute) downloadResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDownloadResult_RevisionNr() {
		return (EAttribute) downloadResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDownloadResult_File() {
		return (EAttribute) downloadResultEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDownloadResult_SerializerOid() {
		return (EAttribute) downloadResultEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckoutResult() {
		return checkoutResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataValue() {
		return dataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataValue_FieldName() {
		return (EAttribute) dataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDataObject() {
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataObject_Type() {
		return (EAttribute) dataObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataObject_Guid() {
		return (EAttribute) dataObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDataObject_Name() {
		return (EAttribute) dataObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDataObject_Values() {
		return (EReference) dataObjectEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUserSession() {
		return userSessionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUserSession_User() {
		return (EReference) userSessionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_Username() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_Name() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_Type() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_RemoteAddress() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_ActiveSince() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_LastActive() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUserSession_AccessMethod() {
		return (EAttribute) userSessionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMigration() {
		return migrationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigration_Number() {
		return (EAttribute) migrationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigration_Description() {
		return (EAttribute) migrationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMigration_Executed() {
		return (EAttribute) migrationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReferenceDataValue() {
		return referenceDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceDataValue_TypeName() {
		return (EAttribute) referenceDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReferenceDataValue_Guid() {
		return (EAttribute) referenceDataValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getListDataValue() {
		return listDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getListDataValue_Values() {
		return (EReference) listDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSimpleDataValue() {
		return simpleDataValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSimpleDataValue_StringValue() {
		return (EAttribute) simpleDataValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseInformationItem() {
		return databaseInformationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformationItem_Key() {
		return (EAttribute) databaseInformationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformationItem_Value() {
		return (EAttribute) databaseInformationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseInformationCategory() {
		return databaseInformationCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformationCategory_Title() {
		return (EAttribute) databaseInformationCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseInformationCategory_Items() {
		return (EReference) databaseInformationCategoryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDatabaseInformation() {
		return databaseInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_NumberOfProjects() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_NumberOfUsers() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_NumberOfRevisions() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_NumberOfCheckouts() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_DatabaseSizeInBytes() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_Type() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_Created() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_Location() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDatabaseInformation_SchemaVersion() {
		return (EAttribute) databaseInformationEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDatabaseInformation_Categories() {
		return (EReference) databaseInformationEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginDescriptor() {
		return pluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_Name() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_PluginClassName() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_Description() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_Location() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_Enabled() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_PluginInterfaceClassName() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginDescriptor_Configurations() {
		return (EReference) pluginDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_Identifier() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginDescriptor_InstallForNewUsers() {
		return (EAttribute) pluginDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginDescriptor_PluginBundleVersion() {
		return (EReference) pluginDescriptorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginDescriptor_Settings() {
		return (EReference) pluginDescriptorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevisionSummaryType() {
		return revisionSummaryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevisionSummaryType_Name() {
		return (EAttribute) revisionSummaryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevisionSummaryType_Count() {
		return (EAttribute) revisionSummaryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevisionSummaryType_Schema() {
		return (EAttribute) revisionSummaryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevisionSummaryContainer() {
		return revisionSummaryContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRevisionSummaryContainer_Name() {
		return (EAttribute) revisionSummaryContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevisionSummaryContainer_Types() {
		return (EReference) revisionSummaryContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRevisionSummary() {
		return revisionSummaryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRevisionSummary_List() {
		return (EReference) revisionSummaryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongAction() {
		return longActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongAction_Identification() {
		return (EAttribute) longActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLongAction_User() {
		return (EReference) longActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongAction_Start() {
		return (EAttribute) longActionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongAction_Username() {
		return (EAttribute) longActionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongAction_Name() {
		return (EAttribute) longActionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectIDMPluginDescriptor() {
		return objectIDMPluginDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectIDMPluginDescriptor_ClassName() {
		return (EAttribute) objectIDMPluginDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompareItem() {
		return compareItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompareItem_DataObject() {
		return (EReference) compareItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectAdded() {
		return objectAddedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectRemoved() {
		return objectRemovedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectModified() {
		return objectModifiedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectModified_FieldName() {
		return (EAttribute) objectModifiedEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectModified_OldValue() {
		return (EAttribute) objectModifiedEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectModified_NewValue() {
		return (EAttribute) objectModifiedEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompareContainer() {
		return compareContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCompareContainer_Type() {
		return (EAttribute) compareContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompareContainer_Items() {
		return (EReference) compareContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCompareResult() {
		return compareResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCompareResult_Items() {
		return (EReference) compareResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongActionState() {
		return longActionStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Start() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_End() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Progress() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_State() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Title() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Stage() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Errors() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Warnings() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_Infos() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongActionState_TopicId() {
		return (EAttribute) longActionStateEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServerInfo() {
		return serverInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerInfo_ServerState() {
		return (EAttribute) serverInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServerInfo_ErrorMessage() {
		return (EAttribute) serverInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServerInfo_Version() {
		return (EReference) serverInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersion() {
		return versionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Major() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Minor() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Revision() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_FullString() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_Date() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_DownloadUrl() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_SupportUrl() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersion_SupportEmail() {
		return (EAttribute) versionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Data() {
		return (EAttribute) fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Filename() {
		return (EAttribute) fileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Mime() {
		return (EAttribute) fileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Size() {
		return (EAttribute) fileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendedDataSchema() {
		return extendedDataSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedDataSchema_Name() {
		return (EAttribute) extendedDataSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedDataSchema_Url() {
		return (EAttribute) extendedDataSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedDataSchema_ContentType() {
		return (EAttribute) extendedDataSchemaEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedDataSchema_Description() {
		return (EAttribute) extendedDataSchemaEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedDataSchema_File() {
		return (EReference) extendedDataSchemaEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedDataSchema_Size() {
		return (EAttribute) extendedDataSchemaEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedDataSchema_Users() {
		return (EReference) extendedDataSchemaEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedDataSchema_ExtendedData() {
		return (EReference) extendedDataSchemaEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExtendedData() {
		return extendedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedData_Url() {
		return (EAttribute) extendedDataEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedData_File() {
		return (EReference) extendedDataEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedData_Size() {
		return (EAttribute) extendedDataEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedData_Title() {
		return (EAttribute) extendedDataEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedData_Added() {
		return (EAttribute) extendedDataEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedData_User() {
		return (EReference) extendedDataEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedData_Schema() {
		return (EReference) extendedDataEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedData_Revision() {
		return (EReference) extendedDataEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getExtendedData_Project() {
		return (EReference) extendedDataEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExtendedData_TimeToGenerate() {
		return (EAttribute) extendedDataEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getQueryEnginePluginConfiguration() {
		return queryEnginePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getQueryEnginePluginConfiguration_UserSettings() {
		return (EReference) queryEnginePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWebModulePluginConfiguration() {
		return webModulePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getWebModulePluginConfiguration_ServerSettings() {
		return (EReference) webModulePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelMergerPluginConfiguration() {
		return modelMergerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelMergerPluginConfiguration_UserSettings() {
		return (EReference) modelMergerPluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelComparePluginConfiguration() {
		return modelComparePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelComparePluginConfiguration_UserSettings() {
		return (EReference) modelComparePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProfileDescriptor() {
		return profileDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileDescriptor_Name() {
		return (EAttribute) profileDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileDescriptor_Description() {
		return (EAttribute) profileDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileDescriptor_PublicProfile() {
		return (EAttribute) profileDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProfileDescriptor_Identifier() {
		return (EAttribute) profileDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceDescriptor() {
		return serviceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_Name() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_Url() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_Token() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_Identifier() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_NotificationProtocol() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_Description() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_Trigger() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_ReadRevision() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_ReadExtendedData() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_WriteRevision() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_WriteExtendedData() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_ProviderName() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_CompanyUrl() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_TokenUrl() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_NewProfileUrl() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_RegisterUrl() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceDescriptor_AuthorizeUrl() {
		return (EAttribute) serviceDescriptorEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getService() {
		return serviceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Name() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ServiceName() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ServiceIdentifier() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ProviderName() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Url() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Token() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_NotificationProtocol() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Description() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_Trigger() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ReadRevision() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_ReadExtendedData() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_WriteRevision() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_WriteExtendedData() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ProfileIdentifier() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ProfileName() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ProfileDescription() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getService_ProfilePublic() {
		return (EAttribute) serviceEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_Project() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_User() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_InternalService() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getService_ModelCheckers() {
		return (EReference) serviceEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getToken() {
		return tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_TokenString() {
		return (EAttribute) tokenEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getToken_Expires() {
		return (EAttribute) tokenEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInternalServicePluginConfiguration() {
		return internalServicePluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalServicePluginConfiguration_RemoteAccessible() {
		return (EAttribute) internalServicePluginConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInternalServicePluginConfiguration_UserSettings() {
		return (EReference) internalServicePluginConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInternalServicePluginConfiguration_PublicProfile() {
		return (EAttribute) internalServicePluginConfigurationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceInterface() {
		return serviceInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterface_Name() {
		return (EAttribute) serviceInterfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterface_NameSpace() {
		return (EAttribute) serviceInterfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceInterface_SimpleName() {
		return (EAttribute) serviceInterfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceMethod() {
		return serviceMethodEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceMethod_Name() {
		return (EAttribute) serviceMethodEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceMethod_Doc() {
		return (EAttribute) serviceMethodEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceMethod_ReturnDoc() {
		return (EAttribute) serviceMethodEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceField() {
		return serviceFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceField_Name() {
		return (EAttribute) serviceFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceField_Type() {
		return (EReference) serviceFieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceField_GenericType() {
		return (EReference) serviceFieldEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceField_Doc() {
		return (EAttribute) serviceFieldEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceType() {
		return serviceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_Name() {
		return (EAttribute) serviceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_SimpleName() {
		return (EAttribute) serviceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceType_Fields() {
		return (EReference) serviceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceType_SimpleType() {
		return (EAttribute) serviceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getServiceParameter() {
		return serviceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceParameter_Name() {
		return (EAttribute) serviceParameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getServiceParameter_Doc() {
		return (EAttribute) serviceParameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceParameter_Type() {
		return (EReference) serviceParameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getServiceParameter_GenericType() {
		return (EReference) serviceParameterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeDefinition() {
		return typeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectDefinition() {
		return objectDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectDefinition_Parameters() {
		return (EReference) objectDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveDefinition() {
		return primitiveDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPrimitiveDefinition_Type() {
		return (EAttribute) primitiveDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayDefinition() {
		return arrayDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayDefinition_Type() {
		return (EReference) arrayDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameterDefinition() {
		return parameterDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Name() {
		return (EAttribute) parameterDefinitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Identifier() {
		return (EAttribute) parameterDefinitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Required() {
		return (EAttribute) parameterDefinitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameterDefinition_Description() {
		return (EAttribute) parameterDefinitionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_Type() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameterDefinition_DefaultValue() {
		return (EReference) parameterDefinitionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getType() {
		return typeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getObjectType() {
		return objectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getObjectType_Name() {
		return (EAttribute) objectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getObjectType_Parameters() {
		return (EReference) objectTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPrimitiveType() {
		return primitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongType() {
		return longTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongType_Value() {
		return (EAttribute) longTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getByteArrayType() {
		return byteArrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getByteArrayType_Value() {
		return (EAttribute) byteArrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDoubleType() {
		return doubleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDoubleType_Value() {
		return (EAttribute) doubleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringType() {
		return stringTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringType_Value() {
		return (EAttribute) stringTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBooleanType() {
		return booleanTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBooleanType_Value() {
		return (EAttribute) booleanTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArrayType() {
		return arrayTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArrayType_Values() {
		return (EReference) arrayTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getParameter() {
		return parameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Identifier() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getParameter_Name() {
		return (EAttribute) parameterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getParameter_Value() {
		return (EReference) parameterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getImmediateNotificationResult() {
		return immediateNotificationResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImmediateNotificationResult_Result() {
		return (EAttribute) immediateNotificationResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getImmediateNotificationResult_Description() {
		return (EAttribute) immediateNotificationResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRemoteServiceUpdate() {
		return remoteServiceUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPercentageChange() {
		return percentageChangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPercentageChange_Percentage() {
		return (EAttribute) percentageChangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemInfo() {
		return systemInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_Cpucores() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_Datetime() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_Osname() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_Osversion() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_UserName() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_UserHome() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemInfo_UserDir() {
		return (EAttribute) systemInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJavaInfo() {
		return javaInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_HeapTotal() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_HeapUsed() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_HeapFree() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_HeapMax() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_Threads() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaHome() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaVersion() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaVendor() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaVendorurl() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavavmVersion() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavavmVendor() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavavmName() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaspecVersion() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaspecVendor() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaspecName() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaClassVersion() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaClasspath() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaLibrarypath() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaIoTmp() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaExtdir() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaFileSeparator() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaPathSeparator() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJavaInfo_JavaLineSeparator() {
		return (EAttribute) javaInfoEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBimServerInfo() {
		return bimServerInfoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_CurrentVersion() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_CurrentDate() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_SchemaVersion() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_LatestDate() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_LatestVersion() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_Projects() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_Revisions() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_Users() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_Checkouts() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_ServerLogUrl() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBimServerInfo_Started() {
		return (EAttribute) bimServerInfoEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getProjectSmall() {
		return projectSmallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_Name() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_ParentId() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_State() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_NrRevisions() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_NrSubProjects() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_HasCheckinRights() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_LastRevisionId() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getProjectSmall_Schema() {
		return (EAttribute) projectSmallEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIfcHeader() {
		return ifcHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_Description() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_ImplementationLevel() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_Filename() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_TimeStamp() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_Author() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_Organization() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_PreProcessorVersion() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_OriginatingSystem() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_IfcSchemaVersion() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIfcHeader_Authorization() {
		return (EAttribute) ifcHeaderEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelCheckerResultItem() {
		return modelCheckerResultItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelCheckerResultHeader() {
		return modelCheckerResultHeaderEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResultHeader_Text() {
		return (EAttribute) modelCheckerResultHeaderEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelCheckerResultLine() {
		return modelCheckerResultLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResultLine_FieldOrClass() {
		return (EAttribute) modelCheckerResultLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResultLine_Value() {
		return (EAttribute) modelCheckerResultLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResultLine_ShouldBe() {
		return (EAttribute) modelCheckerResultLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResultLine_Type() {
		return (EAttribute) modelCheckerResultLineEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResultLine_ObjectId() {
		return (EAttribute) modelCheckerResultLineEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelCheckerResult() {
		return modelCheckerResultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerResult_Valid() {
		return (EAttribute) modelCheckerResultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getModelCheckerResult_Items() {
		return (EReference) modelCheckerResultEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getModelCheckerInstance() {
		return modelCheckerInstanceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerInstance_Name() {
		return (EAttribute) modelCheckerInstanceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerInstance_Description() {
		return (EAttribute) modelCheckerInstanceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerInstance_Code() {
		return (EAttribute) modelCheckerInstanceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerInstance_Compiled() {
		return (EAttribute) modelCheckerInstanceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerInstance_Valid() {
		return (EAttribute) modelCheckerInstanceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getModelCheckerInstance_ModelCheckerPluginClassName() {
		return (EAttribute) modelCheckerInstanceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMessagingSerializerPluginConfiguration() {
		return messagingSerializerPluginConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMetrics() {
		return metricsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMetrics_Interfaces() {
		return (EReference) metricsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInterfaceMetric() {
		return interfaceMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInterfaceMetric_Methods() {
		return (EReference) interfaceMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInterfaceMetric_Name() {
		return (EAttribute) interfaceMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMethodMetric() {
		return methodMetricEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodMetric_Name() {
		return (EAttribute) methodMetricEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodMetric_NrCalls() {
		return (EAttribute) methodMetricEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodMetric_LastCall() {
		return (EAttribute) methodMetricEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodMetric_AverageMs() {
		return (EAttribute) methodMetricEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodMetric_ShortestMs() {
		return (EAttribute) methodMetricEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMethodMetric_LongestMs() {
		return (EAttribute) methodMetricEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginBundleVersion() {
		return pluginBundleVersionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Version() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Type() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Description() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Mismatch() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Repository() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_GroupId() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_ArtifactId() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Icon() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Organization() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Name() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundleVersion_Date() {
		return (EAttribute) pluginBundleVersionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginBundle() {
		return pluginBundleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundle_Organization() {
		return (EAttribute) pluginBundleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginBundle_Name() {
		return (EAttribute) pluginBundleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginBundle_LatestVersion() {
		return (EReference) pluginBundleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginBundle_AvailableVersions() {
		return (EReference) pluginBundleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPluginBundle_InstalledVersion() {
		return (EReference) pluginBundleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPluginInformation() {
		return pluginInformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_Name() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_Type() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_Description() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_Enabled() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_Identifier() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_InstallForAllUsers() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPluginInformation_InstallForNewUsers() {
		return (EAttribute) pluginInformationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOAuthServer() {
		return oAuthServerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_RegistrationUrl() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ClientId() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ClientSecret() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ClientName() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ClientIcon() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ClientUrl() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ClientDescription() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_RedirectUrl() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ExpiresAt() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_IssuedAt() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_Incoming() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_ApiUrl() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthServer_RegistrationEndpoint() {
		return (EAttribute) oAuthServerEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOAuthAuthorizationCode() {
		return oAuthAuthorizationCodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOAuthAuthorizationCode_OauthServer() {
		return (EReference) oAuthAuthorizationCodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthAuthorizationCode_Code() {
		return (EAttribute) oAuthAuthorizationCodeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOAuthAuthorizationCode_Authorization() {
		return (EReference) oAuthAuthorizationCodeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOAuthAuthorizationCode_User() {
		return (EReference) oAuthAuthorizationCodeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOAuthAuthorizationCode_Issued() {
		return (EAttribute) oAuthAuthorizationCodeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAuthorization() {
		return authorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSingleProjectAuthorization() {
		return singleProjectAuthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSingleProjectAuthorization_Project() {
		return (EReference) singleProjectAuthorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNewServiceDescriptor() {
		return newServiceDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_Name() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_Description() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_Provider() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_AuthorizationUrl() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_TokenUrl() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_ResourceUrl() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_RegisterUrl() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_Inputs() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewServiceDescriptor_Outputs() {
		return (EAttribute) newServiceDescriptorEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFormatSerializerMap() {
		return formatSerializerMapEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFormatSerializerMap_Format() {
		return (EAttribute) formatSerializerMapEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFormatSerializerMap_Serializers() {
		return (EReference) formatSerializerMapEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStoreExtendedData() {
		return storeExtendedDataEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCheckinRevision() {
		return checkinRevisionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCheckinRevision_Project() {
		return (EReference) checkinRevisionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNewService() {
		return newServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_Name() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_Provider() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_Description() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_AuthorizationUrl() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_TokenUrl() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_ResourceUrl() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_RegisterUrl() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_Input() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_OauthCode() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_Status() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNewService_Serializer() {
		return (EReference) newServiceEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_Output() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNewService_Action() {
		return (EReference) newServiceEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_AccessToken() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNewService_Project() {
		return (EReference) newServiceEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNewService_StateJson() {
		return (EAttribute) newServiceEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRunServiceAuthorization() {
		return runServiceAuthorizationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRunServiceAuthorization_Service() {
		return (EReference) runServiceAuthorizationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDensityCollection() {
		return densityCollectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDensityCollection_Densities() {
		return (EReference) densityCollectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDensity() {
		return densityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDensity_Type() {
		return (EAttribute) densityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDensity_GeometryInfoId() {
		return (EAttribute) densityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDensity_TrianglesBelow() {
		return (EAttribute) densityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDensity_TrianglesAbove() {
		return (EAttribute) densityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDensity_Volume() {
		return (EAttribute) densityEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDensity_Density() {
		return (EAttribute) densityEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLongCheckinActionState() {
		return longCheckinActionStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongCheckinActionState_Roid() {
		return (EAttribute) longCheckinActionStateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLongCheckinActionState_DeserializeErrorCode() {
		return (EAttribute) longCheckinActionStateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTile() {
		return tileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_TileId() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTile_NrObjects() {
		return (EAttribute) tileEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTile_MinBounds() {
		return (EReference) tileEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTile_Bounds() {
		return (EReference) tileEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getUserType() {
		return userTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSIPrefix() {
		return siPrefixEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getObjectState() {
		return objectStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getCompareType() {
		return compareTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getActionState() {
		return actionStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServerState() {
		return serverStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTrigger() {
		return triggerEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceSimpleType() {
		return serviceSimpleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPrimitiveEnum() {
		return primitiveEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getNotifictionResultEnum() {
		return notifictionResultEnumEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getProgressTopicType() {
		return progressTopicTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getModelCheckerResultType() {
		return modelCheckerResultTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSmtpProtocol() {
		return smtpProtocolEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPluginBundleType() {
		return pluginBundleTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getPluginType() {
		return pluginTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getServiceStatus() {
		return serviceStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getDataHandler() {
		return dataHandlerEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StoreFactory getStoreFactory() {
		return (StoreFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__ID);
		createEAttribute(projectEClass, PROJECT__NAME);
		createEReference(projectEClass, PROJECT__HAS_AUTHORIZED_USERS);
		createEReference(projectEClass, PROJECT__CONCRETE_REVISIONS);
		createEReference(projectEClass, PROJECT__REVISIONS);
		createEReference(projectEClass, PROJECT__LAST_CONCRETE_REVISION);
		createEReference(projectEClass, PROJECT__LAST_REVISION);
		createEReference(projectEClass, PROJECT__CHECKOUTS);
		createEAttribute(projectEClass, PROJECT__STATE);
		createEAttribute(projectEClass, PROJECT__CREATED_DATE);
		createEReference(projectEClass, PROJECT__CREATED_BY);
		createEReference(projectEClass, PROJECT__GEO_TAG);
		createEReference(projectEClass, PROJECT__SUB_PROJECTS);
		createEReference(projectEClass, PROJECT__PARENT);
		createEAttribute(projectEClass, PROJECT__DESCRIPTION);
		createEAttribute(projectEClass, PROJECT__EXPORT_LENGTH_MEASURE_PREFIX);
		createEReference(projectEClass, PROJECT__EXTENDED_DATA);
		createEReference(projectEClass, PROJECT__SERVICES);
		createEReference(projectEClass, PROJECT__LOGS);
		createEReference(projectEClass, PROJECT__MODEL_CHECKERS);
		createEAttribute(projectEClass, PROJECT__SCHEMA);
		createEAttribute(projectEClass, PROJECT__SEND_EMAIL_ON_NEW_REVISION);
		createEReference(projectEClass, PROJECT__NEW_SERVICES);
		createEAttribute(projectEClass, PROJECT__CHECKIN_IN_PROGRESS);

		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__NAME);
		createEAttribute(userEClass, USER__PASSWORD_HASH);
		createEAttribute(userEClass, USER__PASSWORD_SALT);
		createEReference(userEClass, USER__HAS_RIGHTS_ON);
		createEAttribute(userEClass, USER__STATE);
		createEAttribute(userEClass, USER__CREATED_ON);
		createEReference(userEClass, USER__CREATED_BY);
		createEAttribute(userEClass, USER__USER_TYPE);
		createEAttribute(userEClass, USER__USERNAME);
		createEAttribute(userEClass, USER__LAST_SEEN);
		createEAttribute(userEClass, USER__TOKEN);
		createEAttribute(userEClass, USER__VALIDATION_TOKEN);
		createEAttribute(userEClass, USER__VALIDATION_TOKEN_CREATED);
		createEReference(userEClass, USER__USER_SETTINGS);
		createEReference(userEClass, USER__SCHEMAS);
		createEReference(userEClass, USER__EXTENDED_DATA);
		createEReference(userEClass, USER__SERVICES);
		createEReference(userEClass, USER__LOGS);
		createEReference(userEClass, USER__OAUTH_AUTHORIZATION_CODES);
		createEReference(userEClass, USER__OAUTH_ISSUED_AUTHORIZATION_CODES);

		revisionEClass = createEClass(REVISION);
		createEAttribute(revisionEClass, REVISION__ID);
		createEReference(revisionEClass, REVISION__USER);
		createEAttribute(revisionEClass, REVISION__DATE);
		createEAttribute(revisionEClass, REVISION__COMMENT);
		createEAttribute(revisionEClass, REVISION__SIZE);
		createEReference(revisionEClass, REVISION__CONCRETE_REVISIONS);
		createEReference(revisionEClass, REVISION__LAST_CONCRETE_REVISION);
		createEReference(revisionEClass, REVISION__CHECKOUTS);
		createEReference(revisionEClass, REVISION__PROJECT);
		createEAttribute(revisionEClass, REVISION__TAG);
		createEAttribute(revisionEClass, REVISION__LAST_ERROR);
		createEAttribute(revisionEClass, REVISION__BMI);
		createEReference(revisionEClass, REVISION__EXTENDED_DATA);
		createEReference(revisionEClass, REVISION__LOGS);
		createEReference(revisionEClass, REVISION__SERVICE);
		createEAttribute(revisionEClass, REVISION__HAS_GEOMETRY);
		createEReference(revisionEClass, REVISION__BOUNDS);
		createEReference(revisionEClass, REVISION__BOUNDS_UNTRANSFORMED);
		createEReference(revisionEClass, REVISION__BOUNDS_MM);
		createEReference(revisionEClass, REVISION__BOUNDS_UNTRANSFORMED_MM);
		createEReference(revisionEClass, REVISION__SERVICES_LINKED);
		createEReference(revisionEClass, REVISION__DENSITY_COLLECTION);
		createEAttribute(revisionEClass, REVISION__NR_PRIMITIVES);

		concreteRevisionEClass = createEClass(CONCRETE_REVISION);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__ID);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__PROJECT);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__CHECKSUM);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__REVISIONS);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__SIZE);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__DATE);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__LAST_ERROR);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__CLEAR);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__SUMMARY);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__USER);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__IFC_HEADER);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__BOUNDS);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__BOUNDS_UNTRANSFORMED);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__OID_COUNTERS);
		createEAttribute(concreteRevisionEClass, CONCRETE_REVISION__MULTIPLIER_TO_MM);
		createEReference(concreteRevisionEClass, CONCRETE_REVISION__DENSITY_COLLECTION);

		geoTagEClass = createEClass(GEO_TAG);
		createEAttribute(geoTagEClass, GEO_TAG__ENABLED);
		createEReference(geoTagEClass, GEO_TAG__PROJECTS);
		createEAttribute(geoTagEClass, GEO_TAG__X);
		createEAttribute(geoTagEClass, GEO_TAG__Y);
		createEAttribute(geoTagEClass, GEO_TAG__Z);
		createEAttribute(geoTagEClass, GEO_TAG__EPSG);
		createEAttribute(geoTagEClass, GEO_TAG__DIRECTION_ANGLE);

		checkoutEClass = createEClass(CHECKOUT);
		createEReference(checkoutEClass, CHECKOUT__USER);
		createEReference(checkoutEClass, CHECKOUT__REVISION);
		createEReference(checkoutEClass, CHECKOUT__PROJECT);
		createEAttribute(checkoutEClass, CHECKOUT__DATE);
		createEReference(checkoutEClass, CHECKOUT__CHECKIN);
		createEAttribute(checkoutEClass, CHECKOUT__ACTIVE);
		createEReference(checkoutEClass, CHECKOUT__LOGS);

		serverSettingsEClass = createEClass(SERVER_SETTINGS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SEND_CONFIRMATION_EMAIL_AFTER_REGISTRATION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ALLOW_SELF_REGISTRATION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ALLOW_USERS_TO_CREATE_TOP_LEVEL_PROJECTS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__CHECKIN_MERGING_ENABLED);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SMTP_SERVER);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__EMAIL_SENDER_ADDRESS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__EMAIL_SENDER_NAME);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SITE_ADDRESS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__GENERATE_GEOMETRY_ON_CHECKIN);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ALLOW_ONLY_WHITELISTED);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__WHITELISTED_DOMAINS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__HIDE_USER_LIST_FOR_NON_ADMIN);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__PROTOCOL_BUFFERS_PORT);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__CACHE_OUTPUT_FILES);
		createEReference(serverSettingsEClass, SERVER_SETTINGS__WEB_MODULES);
		createEReference(serverSettingsEClass, SERVER_SETTINGS__WEB_MODULE);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SERVICE_REPOSITORY_URL);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SEND_EMAIL_ON_NEW_REVISION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SESSION_TIME_OUT_SECONDS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SMTP_USERNAME);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SMTP_PASSWORD);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SMTP_PORT);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__SMTP_PROTOCOL);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__REUSE_GEOMETRY);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ALLOW_CREATE_VALIDATED_USER);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__RENDER_ENGINE_PROCESSES);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__PLUGIN_STRICT_VERSION_CHECKING);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__NAME);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__DESCRIPTION);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__ICON);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__STORE_LAST_LOGIN);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__STORE_SERVICE_RUNS);
		createEAttribute(serverSettingsEClass, SERVER_SETTINGS__OPTIMIZE_MAPPED_ITEMS);
		createEReference(serverSettingsEClass, SERVER_SETTINGS__DEFAULT_RENDER_ENGINE_PLUGIN);

		userSettingsEClass = createEClass(USER_SETTINGS);
		createEReference(userSettingsEClass, USER_SETTINGS__SERIALIZERS);
		createEReference(userSettingsEClass, USER_SETTINGS__OBJECT_ID_MS);
		createEReference(userSettingsEClass, USER_SETTINGS__RENDER_ENGINES);
		createEReference(userSettingsEClass, USER_SETTINGS__DESERIALIZERS);
		createEReference(userSettingsEClass, USER_SETTINGS__QUERY_ENGINES);
		createEReference(userSettingsEClass, USER_SETTINGS__MODEL_MERGERS);
		createEReference(userSettingsEClass, USER_SETTINGS__MODEL_COMPARES);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_MODEL_MERGER);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_MODEL_COMPARE);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_QUERY_ENGINE);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_RENDER_ENGINE);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_SERIALIZER);
		createEReference(userSettingsEClass, USER_SETTINGS__DEFAULT_OBJECT_IDM);
		createEReference(userSettingsEClass, USER_SETTINGS__SERVICES);

		pluginConfigurationEClass = createEClass(PLUGIN_CONFIGURATION);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__NAME);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__ENABLED);
		createEAttribute(pluginConfigurationEClass, PLUGIN_CONFIGURATION__DESCRIPTION);
		createEReference(pluginConfigurationEClass, PLUGIN_CONFIGURATION__PLUGIN_DESCRIPTOR);
		createEReference(pluginConfigurationEClass, PLUGIN_CONFIGURATION__SETTINGS);

		serializerPluginConfigurationEClass = createEClass(SERIALIZER_PLUGIN_CONFIGURATION);
		createEReference(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__OBJECT_IDM);
		createEReference(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS);
		createEReference(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__RENDER_ENGINE);
		createEAttribute(serializerPluginConfigurationEClass, SERIALIZER_PLUGIN_CONFIGURATION__STREAMING);

		objectIDMPluginConfigurationEClass = createEClass(OBJECT_IDM_PLUGIN_CONFIGURATION);
		createEReference(objectIDMPluginConfigurationEClass, OBJECT_IDM_PLUGIN_CONFIGURATION__SERIALIZERS);
		createEReference(objectIDMPluginConfigurationEClass, OBJECT_IDM_PLUGIN_CONFIGURATION__USER_SETTINGS);

		renderEnginePluginConfigurationEClass = createEClass(RENDER_ENGINE_PLUGIN_CONFIGURATION);
		createEReference(renderEnginePluginConfigurationEClass, RENDER_ENGINE_PLUGIN_CONFIGURATION__SERIALIZERS);
		createEReference(renderEnginePluginConfigurationEClass, RENDER_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		deserializerPluginConfigurationEClass = createEClass(DESERIALIZER_PLUGIN_CONFIGURATION);
		createEReference(deserializerPluginConfigurationEClass, DESERIALIZER_PLUGIN_CONFIGURATION__USER_SETTINGS);

		downloadResultEClass = createEClass(DOWNLOAD_RESULT);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__PROJECT_NAME);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__REVISION_NR);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__FILE);
		createEAttribute(downloadResultEClass, DOWNLOAD_RESULT__SERIALIZER_OID);

		checkoutResultEClass = createEClass(CHECKOUT_RESULT);

		dataValueEClass = createEClass(DATA_VALUE);
		createEAttribute(dataValueEClass, DATA_VALUE__FIELD_NAME);

		dataObjectEClass = createEClass(DATA_OBJECT);
		createEAttribute(dataObjectEClass, DATA_OBJECT__TYPE);
		createEAttribute(dataObjectEClass, DATA_OBJECT__GUID);
		createEAttribute(dataObjectEClass, DATA_OBJECT__NAME);
		createEReference(dataObjectEClass, DATA_OBJECT__VALUES);

		userSessionEClass = createEClass(USER_SESSION);
		createEReference(userSessionEClass, USER_SESSION__USER);
		createEAttribute(userSessionEClass, USER_SESSION__USERNAME);
		createEAttribute(userSessionEClass, USER_SESSION__NAME);
		createEAttribute(userSessionEClass, USER_SESSION__TYPE);
		createEAttribute(userSessionEClass, USER_SESSION__REMOTE_ADDRESS);
		createEAttribute(userSessionEClass, USER_SESSION__ACTIVE_SINCE);
		createEAttribute(userSessionEClass, USER_SESSION__LAST_ACTIVE);
		createEAttribute(userSessionEClass, USER_SESSION__ACCESS_METHOD);

		migrationEClass = createEClass(MIGRATION);
		createEAttribute(migrationEClass, MIGRATION__NUMBER);
		createEAttribute(migrationEClass, MIGRATION__DESCRIPTION);
		createEAttribute(migrationEClass, MIGRATION__EXECUTED);

		referenceDataValueEClass = createEClass(REFERENCE_DATA_VALUE);
		createEAttribute(referenceDataValueEClass, REFERENCE_DATA_VALUE__TYPE_NAME);
		createEAttribute(referenceDataValueEClass, REFERENCE_DATA_VALUE__GUID);

		listDataValueEClass = createEClass(LIST_DATA_VALUE);
		createEReference(listDataValueEClass, LIST_DATA_VALUE__VALUES);

		simpleDataValueEClass = createEClass(SIMPLE_DATA_VALUE);
		createEAttribute(simpleDataValueEClass, SIMPLE_DATA_VALUE__STRING_VALUE);

		databaseInformationItemEClass = createEClass(DATABASE_INFORMATION_ITEM);
		createEAttribute(databaseInformationItemEClass, DATABASE_INFORMATION_ITEM__KEY);
		createEAttribute(databaseInformationItemEClass, DATABASE_INFORMATION_ITEM__VALUE);

		databaseInformationCategoryEClass = createEClass(DATABASE_INFORMATION_CATEGORY);
		createEAttribute(databaseInformationCategoryEClass, DATABASE_INFORMATION_CATEGORY__TITLE);
		createEReference(databaseInformationCategoryEClass, DATABASE_INFORMATION_CATEGORY__ITEMS);

		databaseInformationEClass = createEClass(DATABASE_INFORMATION);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_PROJECTS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_USERS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_REVISIONS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__NUMBER_OF_CHECKOUTS);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__DATABASE_SIZE_IN_BYTES);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__TYPE);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__CREATED);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__LOCATION);
		createEAttribute(databaseInformationEClass, DATABASE_INFORMATION__SCHEMA_VERSION);
		createEReference(databaseInformationEClass, DATABASE_INFORMATION__CATEGORIES);

		pluginDescriptorEClass = createEClass(PLUGIN_DESCRIPTOR);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__NAME);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__PLUGIN_CLASS_NAME);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__DESCRIPTION);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__LOCATION);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__ENABLED);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__PLUGIN_INTERFACE_CLASS_NAME);
		createEReference(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__CONFIGURATIONS);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__IDENTIFIER);
		createEAttribute(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__INSTALL_FOR_NEW_USERS);
		createEReference(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__PLUGIN_BUNDLE_VERSION);
		createEReference(pluginDescriptorEClass, PLUGIN_DESCRIPTOR__SETTINGS);

		revisionSummaryTypeEClass = createEClass(REVISION_SUMMARY_TYPE);
		createEAttribute(revisionSummaryTypeEClass, REVISION_SUMMARY_TYPE__NAME);
		createEAttribute(revisionSummaryTypeEClass, REVISION_SUMMARY_TYPE__COUNT);
		createEAttribute(revisionSummaryTypeEClass, REVISION_SUMMARY_TYPE__SCHEMA);

		revisionSummaryContainerEClass = createEClass(REVISION_SUMMARY_CONTAINER);
		createEAttribute(revisionSummaryContainerEClass, REVISION_SUMMARY_CONTAINER__NAME);
		createEReference(revisionSummaryContainerEClass, REVISION_SUMMARY_CONTAINER__TYPES);

		revisionSummaryEClass = createEClass(REVISION_SUMMARY);
		createEReference(revisionSummaryEClass, REVISION_SUMMARY__LIST);

		longActionEClass = createEClass(LONG_ACTION);
		createEAttribute(longActionEClass, LONG_ACTION__IDENTIFICATION);
		createEReference(longActionEClass, LONG_ACTION__USER);
		createEAttribute(longActionEClass, LONG_ACTION__START);
		createEAttribute(longActionEClass, LONG_ACTION__USERNAME);
		createEAttribute(longActionEClass, LONG_ACTION__NAME);

		objectIDMPluginDescriptorEClass = createEClass(OBJECT_IDM_PLUGIN_DESCRIPTOR);
		createEAttribute(objectIDMPluginDescriptorEClass, OBJECT_IDM_PLUGIN_DESCRIPTOR__CLASS_NAME);

		compareItemEClass = createEClass(COMPARE_ITEM);
		createEReference(compareItemEClass, COMPARE_ITEM__DATA_OBJECT);

		objectAddedEClass = createEClass(OBJECT_ADDED);

		objectRemovedEClass = createEClass(OBJECT_REMOVED);

		objectModifiedEClass = createEClass(OBJECT_MODIFIED);
		createEAttribute(objectModifiedEClass, OBJECT_MODIFIED__FIELD_NAME);
		createEAttribute(objectModifiedEClass, OBJECT_MODIFIED__OLD_VALUE);
		createEAttribute(objectModifiedEClass, OBJECT_MODIFIED__NEW_VALUE);

		compareContainerEClass = createEClass(COMPARE_CONTAINER);
		createEAttribute(compareContainerEClass, COMPARE_CONTAINER__TYPE);
		createEReference(compareContainerEClass, COMPARE_CONTAINER__ITEMS);

		compareResultEClass = createEClass(COMPARE_RESULT);
		createEReference(compareResultEClass, COMPARE_RESULT__ITEMS);

		longActionStateEClass = createEClass(LONG_ACTION_STATE);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__START);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__END);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__PROGRESS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__STATE);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__TITLE);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__STAGE);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__ERRORS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__WARNINGS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__INFOS);
		createEAttribute(longActionStateEClass, LONG_ACTION_STATE__TOPIC_ID);

		serverInfoEClass = createEClass(SERVER_INFO);
		createEAttribute(serverInfoEClass, SERVER_INFO__SERVER_STATE);
		createEAttribute(serverInfoEClass, SERVER_INFO__ERROR_MESSAGE);
		createEReference(serverInfoEClass, SERVER_INFO__VERSION);

		versionEClass = createEClass(VERSION);
		createEAttribute(versionEClass, VERSION__MAJOR);
		createEAttribute(versionEClass, VERSION__MINOR);
		createEAttribute(versionEClass, VERSION__REVISION);
		createEAttribute(versionEClass, VERSION__FULL_STRING);
		createEAttribute(versionEClass, VERSION__DATE);
		createEAttribute(versionEClass, VERSION__DOWNLOAD_URL);
		createEAttribute(versionEClass, VERSION__SUPPORT_URL);
		createEAttribute(versionEClass, VERSION__SUPPORT_EMAIL);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__DATA);
		createEAttribute(fileEClass, FILE__FILENAME);
		createEAttribute(fileEClass, FILE__MIME);
		createEAttribute(fileEClass, FILE__SIZE);

		extendedDataSchemaEClass = createEClass(EXTENDED_DATA_SCHEMA);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__NAME);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__URL);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__CONTENT_TYPE);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__DESCRIPTION);
		createEReference(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__FILE);
		createEAttribute(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__SIZE);
		createEReference(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__USERS);
		createEReference(extendedDataSchemaEClass, EXTENDED_DATA_SCHEMA__EXTENDED_DATA);

		extendedDataEClass = createEClass(EXTENDED_DATA);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__URL);
		createEReference(extendedDataEClass, EXTENDED_DATA__FILE);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__SIZE);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__TITLE);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__ADDED);
		createEReference(extendedDataEClass, EXTENDED_DATA__USER);
		createEReference(extendedDataEClass, EXTENDED_DATA__SCHEMA);
		createEReference(extendedDataEClass, EXTENDED_DATA__REVISION);
		createEReference(extendedDataEClass, EXTENDED_DATA__PROJECT);
		createEAttribute(extendedDataEClass, EXTENDED_DATA__TIME_TO_GENERATE);

		queryEnginePluginConfigurationEClass = createEClass(QUERY_ENGINE_PLUGIN_CONFIGURATION);
		createEReference(queryEnginePluginConfigurationEClass, QUERY_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		webModulePluginConfigurationEClass = createEClass(WEB_MODULE_PLUGIN_CONFIGURATION);
		createEReference(webModulePluginConfigurationEClass, WEB_MODULE_PLUGIN_CONFIGURATION__SERVER_SETTINGS);

		modelMergerPluginConfigurationEClass = createEClass(MODEL_MERGER_PLUGIN_CONFIGURATION);
		createEReference(modelMergerPluginConfigurationEClass, MODEL_MERGER_PLUGIN_CONFIGURATION__USER_SETTINGS);

		modelComparePluginConfigurationEClass = createEClass(MODEL_COMPARE_PLUGIN_CONFIGURATION);
		createEReference(modelComparePluginConfigurationEClass, MODEL_COMPARE_PLUGIN_CONFIGURATION__USER_SETTINGS);

		profileDescriptorEClass = createEClass(PROFILE_DESCRIPTOR);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__NAME);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__PUBLIC_PROFILE);
		createEAttribute(profileDescriptorEClass, PROFILE_DESCRIPTOR__IDENTIFIER);

		serviceDescriptorEClass = createEClass(SERVICE_DESCRIPTOR);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__NAME);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__URL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__TOKEN);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__IDENTIFIER);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__NOTIFICATION_PROTOCOL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__TRIGGER);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__READ_REVISION);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__READ_EXTENDED_DATA);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__WRITE_REVISION);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__WRITE_EXTENDED_DATA);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__PROVIDER_NAME);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__COMPANY_URL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__TOKEN_URL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__NEW_PROFILE_URL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__REGISTER_URL);
		createEAttribute(serviceDescriptorEClass, SERVICE_DESCRIPTOR__AUTHORIZE_URL);

		serviceEClass = createEClass(SERVICE);
		createEAttribute(serviceEClass, SERVICE__NAME);
		createEAttribute(serviceEClass, SERVICE__SERVICE_NAME);
		createEAttribute(serviceEClass, SERVICE__SERVICE_IDENTIFIER);
		createEAttribute(serviceEClass, SERVICE__PROVIDER_NAME);
		createEAttribute(serviceEClass, SERVICE__URL);
		createEAttribute(serviceEClass, SERVICE__TOKEN);
		createEAttribute(serviceEClass, SERVICE__NOTIFICATION_PROTOCOL);
		createEAttribute(serviceEClass, SERVICE__DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__TRIGGER);
		createEAttribute(serviceEClass, SERVICE__READ_REVISION);
		createEReference(serviceEClass, SERVICE__READ_EXTENDED_DATA);
		createEReference(serviceEClass, SERVICE__WRITE_REVISION);
		createEReference(serviceEClass, SERVICE__WRITE_EXTENDED_DATA);
		createEAttribute(serviceEClass, SERVICE__PROFILE_IDENTIFIER);
		createEAttribute(serviceEClass, SERVICE__PROFILE_NAME);
		createEAttribute(serviceEClass, SERVICE__PROFILE_DESCRIPTION);
		createEAttribute(serviceEClass, SERVICE__PROFILE_PUBLIC);
		createEReference(serviceEClass, SERVICE__PROJECT);
		createEReference(serviceEClass, SERVICE__USER);
		createEReference(serviceEClass, SERVICE__INTERNAL_SERVICE);
		createEReference(serviceEClass, SERVICE__MODEL_CHECKERS);

		tokenEClass = createEClass(TOKEN);
		createEAttribute(tokenEClass, TOKEN__TOKEN_STRING);
		createEAttribute(tokenEClass, TOKEN__EXPIRES);

		internalServicePluginConfigurationEClass = createEClass(INTERNAL_SERVICE_PLUGIN_CONFIGURATION);
		createEAttribute(internalServicePluginConfigurationEClass,
				INTERNAL_SERVICE_PLUGIN_CONFIGURATION__REMOTE_ACCESSIBLE);
		createEReference(internalServicePluginConfigurationEClass,
				INTERNAL_SERVICE_PLUGIN_CONFIGURATION__USER_SETTINGS);
		createEAttribute(internalServicePluginConfigurationEClass,
				INTERNAL_SERVICE_PLUGIN_CONFIGURATION__PUBLIC_PROFILE);

		serviceInterfaceEClass = createEClass(SERVICE_INTERFACE);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__NAME);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__NAME_SPACE);
		createEAttribute(serviceInterfaceEClass, SERVICE_INTERFACE__SIMPLE_NAME);

		serviceMethodEClass = createEClass(SERVICE_METHOD);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__NAME);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__DOC);
		createEAttribute(serviceMethodEClass, SERVICE_METHOD__RETURN_DOC);

		serviceFieldEClass = createEClass(SERVICE_FIELD);
		createEAttribute(serviceFieldEClass, SERVICE_FIELD__NAME);
		createEReference(serviceFieldEClass, SERVICE_FIELD__TYPE);
		createEReference(serviceFieldEClass, SERVICE_FIELD__GENERIC_TYPE);
		createEAttribute(serviceFieldEClass, SERVICE_FIELD__DOC);

		serviceTypeEClass = createEClass(SERVICE_TYPE);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__NAME);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__SIMPLE_NAME);
		createEReference(serviceTypeEClass, SERVICE_TYPE__FIELDS);
		createEAttribute(serviceTypeEClass, SERVICE_TYPE__SIMPLE_TYPE);

		serviceParameterEClass = createEClass(SERVICE_PARAMETER);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__NAME);
		createEAttribute(serviceParameterEClass, SERVICE_PARAMETER__DOC);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__TYPE);
		createEReference(serviceParameterEClass, SERVICE_PARAMETER__GENERIC_TYPE);

		typeDefinitionEClass = createEClass(TYPE_DEFINITION);

		objectDefinitionEClass = createEClass(OBJECT_DEFINITION);
		createEReference(objectDefinitionEClass, OBJECT_DEFINITION__PARAMETERS);

		primitiveDefinitionEClass = createEClass(PRIMITIVE_DEFINITION);
		createEAttribute(primitiveDefinitionEClass, PRIMITIVE_DEFINITION__TYPE);

		arrayDefinitionEClass = createEClass(ARRAY_DEFINITION);
		createEReference(arrayDefinitionEClass, ARRAY_DEFINITION__TYPE);

		parameterDefinitionEClass = createEClass(PARAMETER_DEFINITION);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__NAME);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__IDENTIFIER);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__REQUIRED);
		createEAttribute(parameterDefinitionEClass, PARAMETER_DEFINITION__DESCRIPTION);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__TYPE);
		createEReference(parameterDefinitionEClass, PARAMETER_DEFINITION__DEFAULT_VALUE);

		typeEClass = createEClass(TYPE);

		objectTypeEClass = createEClass(OBJECT_TYPE);
		createEAttribute(objectTypeEClass, OBJECT_TYPE__NAME);
		createEReference(objectTypeEClass, OBJECT_TYPE__PARAMETERS);

		primitiveTypeEClass = createEClass(PRIMITIVE_TYPE);

		longTypeEClass = createEClass(LONG_TYPE);
		createEAttribute(longTypeEClass, LONG_TYPE__VALUE);

		byteArrayTypeEClass = createEClass(BYTE_ARRAY_TYPE);
		createEAttribute(byteArrayTypeEClass, BYTE_ARRAY_TYPE__VALUE);

		doubleTypeEClass = createEClass(DOUBLE_TYPE);
		createEAttribute(doubleTypeEClass, DOUBLE_TYPE__VALUE);

		stringTypeEClass = createEClass(STRING_TYPE);
		createEAttribute(stringTypeEClass, STRING_TYPE__VALUE);

		booleanTypeEClass = createEClass(BOOLEAN_TYPE);
		createEAttribute(booleanTypeEClass, BOOLEAN_TYPE__VALUE);

		arrayTypeEClass = createEClass(ARRAY_TYPE);
		createEReference(arrayTypeEClass, ARRAY_TYPE__VALUES);

		parameterEClass = createEClass(PARAMETER);
		createEAttribute(parameterEClass, PARAMETER__IDENTIFIER);
		createEAttribute(parameterEClass, PARAMETER__NAME);
		createEReference(parameterEClass, PARAMETER__VALUE);

		immediateNotificationResultEClass = createEClass(IMMEDIATE_NOTIFICATION_RESULT);
		createEAttribute(immediateNotificationResultEClass, IMMEDIATE_NOTIFICATION_RESULT__RESULT);
		createEAttribute(immediateNotificationResultEClass, IMMEDIATE_NOTIFICATION_RESULT__DESCRIPTION);

		remoteServiceUpdateEClass = createEClass(REMOTE_SERVICE_UPDATE);

		percentageChangeEClass = createEClass(PERCENTAGE_CHANGE);
		createEAttribute(percentageChangeEClass, PERCENTAGE_CHANGE__PERCENTAGE);

		systemInfoEClass = createEClass(SYSTEM_INFO);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__CPUCORES);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__DATETIME);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__OSNAME);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__OSVERSION);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__USER_NAME);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__USER_HOME);
		createEAttribute(systemInfoEClass, SYSTEM_INFO__USER_DIR);

		javaInfoEClass = createEClass(JAVA_INFO);
		createEAttribute(javaInfoEClass, JAVA_INFO__HEAP_TOTAL);
		createEAttribute(javaInfoEClass, JAVA_INFO__HEAP_USED);
		createEAttribute(javaInfoEClass, JAVA_INFO__HEAP_FREE);
		createEAttribute(javaInfoEClass, JAVA_INFO__HEAP_MAX);
		createEAttribute(javaInfoEClass, JAVA_INFO__THREADS);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_HOME);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_VERSION);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_VENDOR);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_VENDORURL);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVAVM_VERSION);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVAVM_VENDOR);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVAVM_NAME);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVASPEC_VERSION);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVASPEC_VENDOR);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVASPEC_NAME);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_CLASS_VERSION);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_CLASSPATH);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_LIBRARYPATH);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_IO_TMP);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_EXTDIR);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_FILE_SEPARATOR);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_PATH_SEPARATOR);
		createEAttribute(javaInfoEClass, JAVA_INFO__JAVA_LINE_SEPARATOR);

		bimServerInfoEClass = createEClass(BIM_SERVER_INFO);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__CURRENT_VERSION);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__CURRENT_DATE);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__SCHEMA_VERSION);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__LATEST_DATE);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__LATEST_VERSION);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__PROJECTS);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__REVISIONS);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__USERS);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__CHECKOUTS);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__SERVER_LOG_URL);
		createEAttribute(bimServerInfoEClass, BIM_SERVER_INFO__STARTED);

		projectSmallEClass = createEClass(PROJECT_SMALL);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__NAME);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__PARENT_ID);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__STATE);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__NR_REVISIONS);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__NR_SUB_PROJECTS);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__HAS_CHECKIN_RIGHTS);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__LAST_REVISION_ID);
		createEAttribute(projectSmallEClass, PROJECT_SMALL__SCHEMA);

		ifcHeaderEClass = createEClass(IFC_HEADER);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__DESCRIPTION);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__IMPLEMENTATION_LEVEL);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__FILENAME);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__TIME_STAMP);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__AUTHOR);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__ORGANIZATION);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__PRE_PROCESSOR_VERSION);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__ORIGINATING_SYSTEM);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__IFC_SCHEMA_VERSION);
		createEAttribute(ifcHeaderEClass, IFC_HEADER__AUTHORIZATION);

		modelCheckerResultItemEClass = createEClass(MODEL_CHECKER_RESULT_ITEM);

		modelCheckerResultHeaderEClass = createEClass(MODEL_CHECKER_RESULT_HEADER);
		createEAttribute(modelCheckerResultHeaderEClass, MODEL_CHECKER_RESULT_HEADER__TEXT);

		modelCheckerResultLineEClass = createEClass(MODEL_CHECKER_RESULT_LINE);
		createEAttribute(modelCheckerResultLineEClass, MODEL_CHECKER_RESULT_LINE__FIELD_OR_CLASS);
		createEAttribute(modelCheckerResultLineEClass, MODEL_CHECKER_RESULT_LINE__VALUE);
		createEAttribute(modelCheckerResultLineEClass, MODEL_CHECKER_RESULT_LINE__SHOULD_BE);
		createEAttribute(modelCheckerResultLineEClass, MODEL_CHECKER_RESULT_LINE__TYPE);
		createEAttribute(modelCheckerResultLineEClass, MODEL_CHECKER_RESULT_LINE__OBJECT_ID);

		modelCheckerResultEClass = createEClass(MODEL_CHECKER_RESULT);
		createEAttribute(modelCheckerResultEClass, MODEL_CHECKER_RESULT__VALID);
		createEReference(modelCheckerResultEClass, MODEL_CHECKER_RESULT__ITEMS);

		modelCheckerInstanceEClass = createEClass(MODEL_CHECKER_INSTANCE);
		createEAttribute(modelCheckerInstanceEClass, MODEL_CHECKER_INSTANCE__NAME);
		createEAttribute(modelCheckerInstanceEClass, MODEL_CHECKER_INSTANCE__DESCRIPTION);
		createEAttribute(modelCheckerInstanceEClass, MODEL_CHECKER_INSTANCE__CODE);
		createEAttribute(modelCheckerInstanceEClass, MODEL_CHECKER_INSTANCE__COMPILED);
		createEAttribute(modelCheckerInstanceEClass, MODEL_CHECKER_INSTANCE__VALID);
		createEAttribute(modelCheckerInstanceEClass, MODEL_CHECKER_INSTANCE__MODEL_CHECKER_PLUGIN_CLASS_NAME);

		messagingSerializerPluginConfigurationEClass = createEClass(MESSAGING_SERIALIZER_PLUGIN_CONFIGURATION);

		metricsEClass = createEClass(METRICS);
		createEReference(metricsEClass, METRICS__INTERFACES);

		interfaceMetricEClass = createEClass(INTERFACE_METRIC);
		createEReference(interfaceMetricEClass, INTERFACE_METRIC__METHODS);
		createEAttribute(interfaceMetricEClass, INTERFACE_METRIC__NAME);

		methodMetricEClass = createEClass(METHOD_METRIC);
		createEAttribute(methodMetricEClass, METHOD_METRIC__NAME);
		createEAttribute(methodMetricEClass, METHOD_METRIC__NR_CALLS);
		createEAttribute(methodMetricEClass, METHOD_METRIC__LAST_CALL);
		createEAttribute(methodMetricEClass, METHOD_METRIC__AVERAGE_MS);
		createEAttribute(methodMetricEClass, METHOD_METRIC__SHORTEST_MS);
		createEAttribute(methodMetricEClass, METHOD_METRIC__LONGEST_MS);

		pluginBundleVersionEClass = createEClass(PLUGIN_BUNDLE_VERSION);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__VERSION);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__TYPE);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__DESCRIPTION);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__MISMATCH);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__REPOSITORY);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__GROUP_ID);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__ARTIFACT_ID);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__ICON);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__ORGANIZATION);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__NAME);
		createEAttribute(pluginBundleVersionEClass, PLUGIN_BUNDLE_VERSION__DATE);

		pluginBundleEClass = createEClass(PLUGIN_BUNDLE);
		createEAttribute(pluginBundleEClass, PLUGIN_BUNDLE__ORGANIZATION);
		createEAttribute(pluginBundleEClass, PLUGIN_BUNDLE__NAME);
		createEReference(pluginBundleEClass, PLUGIN_BUNDLE__LATEST_VERSION);
		createEReference(pluginBundleEClass, PLUGIN_BUNDLE__AVAILABLE_VERSIONS);
		createEReference(pluginBundleEClass, PLUGIN_BUNDLE__INSTALLED_VERSION);

		pluginInformationEClass = createEClass(PLUGIN_INFORMATION);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__NAME);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__TYPE);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__DESCRIPTION);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__ENABLED);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__IDENTIFIER);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__INSTALL_FOR_ALL_USERS);
		createEAttribute(pluginInformationEClass, PLUGIN_INFORMATION__INSTALL_FOR_NEW_USERS);

		oAuthServerEClass = createEClass(OAUTH_SERVER);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__REGISTRATION_URL);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__CLIENT_ID);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__CLIENT_SECRET);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__CLIENT_NAME);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__CLIENT_ICON);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__CLIENT_URL);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__CLIENT_DESCRIPTION);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__REDIRECT_URL);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__EXPIRES_AT);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__ISSUED_AT);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__INCOMING);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__API_URL);
		createEAttribute(oAuthServerEClass, OAUTH_SERVER__REGISTRATION_ENDPOINT);

		oAuthAuthorizationCodeEClass = createEClass(OAUTH_AUTHORIZATION_CODE);
		createEReference(oAuthAuthorizationCodeEClass, OAUTH_AUTHORIZATION_CODE__OAUTH_SERVER);
		createEAttribute(oAuthAuthorizationCodeEClass, OAUTH_AUTHORIZATION_CODE__CODE);
		createEReference(oAuthAuthorizationCodeEClass, OAUTH_AUTHORIZATION_CODE__AUTHORIZATION);
		createEReference(oAuthAuthorizationCodeEClass, OAUTH_AUTHORIZATION_CODE__USER);
		createEAttribute(oAuthAuthorizationCodeEClass, OAUTH_AUTHORIZATION_CODE__ISSUED);

		authorizationEClass = createEClass(AUTHORIZATION);

		singleProjectAuthorizationEClass = createEClass(SINGLE_PROJECT_AUTHORIZATION);
		createEReference(singleProjectAuthorizationEClass, SINGLE_PROJECT_AUTHORIZATION__PROJECT);

		newServiceDescriptorEClass = createEClass(NEW_SERVICE_DESCRIPTOR);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__NAME);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__DESCRIPTION);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__PROVIDER);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__AUTHORIZATION_URL);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__TOKEN_URL);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__RESOURCE_URL);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__REGISTER_URL);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__INPUTS);
		createEAttribute(newServiceDescriptorEClass, NEW_SERVICE_DESCRIPTOR__OUTPUTS);

		formatSerializerMapEClass = createEClass(FORMAT_SERIALIZER_MAP);
		createEAttribute(formatSerializerMapEClass, FORMAT_SERIALIZER_MAP__FORMAT);
		createEReference(formatSerializerMapEClass, FORMAT_SERIALIZER_MAP__SERIALIZERS);

		actionEClass = createEClass(ACTION);

		storeExtendedDataEClass = createEClass(STORE_EXTENDED_DATA);

		checkinRevisionEClass = createEClass(CHECKIN_REVISION);
		createEReference(checkinRevisionEClass, CHECKIN_REVISION__PROJECT);

		newServiceEClass = createEClass(NEW_SERVICE);
		createEAttribute(newServiceEClass, NEW_SERVICE__NAME);
		createEAttribute(newServiceEClass, NEW_SERVICE__PROVIDER);
		createEAttribute(newServiceEClass, NEW_SERVICE__DESCRIPTION);
		createEAttribute(newServiceEClass, NEW_SERVICE__AUTHORIZATION_URL);
		createEAttribute(newServiceEClass, NEW_SERVICE__TOKEN_URL);
		createEAttribute(newServiceEClass, NEW_SERVICE__RESOURCE_URL);
		createEAttribute(newServiceEClass, NEW_SERVICE__REGISTER_URL);
		createEAttribute(newServiceEClass, NEW_SERVICE__INPUT);
		createEAttribute(newServiceEClass, NEW_SERVICE__OAUTH_CODE);
		createEAttribute(newServiceEClass, NEW_SERVICE__STATUS);
		createEReference(newServiceEClass, NEW_SERVICE__SERIALIZER);
		createEAttribute(newServiceEClass, NEW_SERVICE__OUTPUT);
		createEReference(newServiceEClass, NEW_SERVICE__ACTION);
		createEAttribute(newServiceEClass, NEW_SERVICE__ACCESS_TOKEN);
		createEReference(newServiceEClass, NEW_SERVICE__PROJECT);
		createEAttribute(newServiceEClass, NEW_SERVICE__STATE_JSON);

		runServiceAuthorizationEClass = createEClass(RUN_SERVICE_AUTHORIZATION);
		createEReference(runServiceAuthorizationEClass, RUN_SERVICE_AUTHORIZATION__SERVICE);

		densityCollectionEClass = createEClass(DENSITY_COLLECTION);
		createEReference(densityCollectionEClass, DENSITY_COLLECTION__DENSITIES);

		densityEClass = createEClass(DENSITY);
		createEAttribute(densityEClass, DENSITY__TYPE);
		createEAttribute(densityEClass, DENSITY__GEOMETRY_INFO_ID);
		createEAttribute(densityEClass, DENSITY__TRIANGLES_BELOW);
		createEAttribute(densityEClass, DENSITY__TRIANGLES_ABOVE);
		createEAttribute(densityEClass, DENSITY__VOLUME);
		createEAttribute(densityEClass, DENSITY__DENSITY);

		longCheckinActionStateEClass = createEClass(LONG_CHECKIN_ACTION_STATE);
		createEAttribute(longCheckinActionStateEClass, LONG_CHECKIN_ACTION_STATE__ROID);
		createEAttribute(longCheckinActionStateEClass, LONG_CHECKIN_ACTION_STATE__DESERIALIZE_ERROR_CODE);

		tileEClass = createEClass(TILE);
		createEAttribute(tileEClass, TILE__TILE_ID);
		createEAttribute(tileEClass, TILE__NR_OBJECTS);
		createEReference(tileEClass, TILE__MIN_BOUNDS);
		createEReference(tileEClass, TILE__BOUNDS);

		// Create enums
		userTypeEEnum = createEEnum(USER_TYPE);
		siPrefixEEnum = createEEnum(SI_PREFIX);
		objectStateEEnum = createEEnum(OBJECT_STATE);
		compareTypeEEnum = createEEnum(COMPARE_TYPE);
		actionStateEEnum = createEEnum(ACTION_STATE);
		serverStateEEnum = createEEnum(SERVER_STATE);
		triggerEEnum = createEEnum(TRIGGER);
		serviceSimpleTypeEEnum = createEEnum(SERVICE_SIMPLE_TYPE);
		primitiveEnumEEnum = createEEnum(PRIMITIVE_ENUM);
		notifictionResultEnumEEnum = createEEnum(NOTIFICTION_RESULT_ENUM);
		progressTopicTypeEEnum = createEEnum(PROGRESS_TOPIC_TYPE);
		modelCheckerResultTypeEEnum = createEEnum(MODEL_CHECKER_RESULT_TYPE);
		smtpProtocolEEnum = createEEnum(SMTP_PROTOCOL);
		pluginBundleTypeEEnum = createEEnum(PLUGIN_BUNDLE_TYPE);
		pluginTypeEEnum = createEEnum(PLUGIN_TYPE);
		serviceStatusEEnum = createEEnum(SERVICE_STATUS);

		// Create data types
		dataHandlerEDataType = createEDataType(DATA_HANDLER);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		LogPackage theLogPackage = (LogPackage) EPackage.Registry.INSTANCE.getEPackage(LogPackage.eNS_URI);
		GeometryPackage theGeometryPackage = (GeometryPackage) EPackage.Registry.INSTANCE
				.getEPackage(GeometryPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		serializerPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		objectIDMPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		renderEnginePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		deserializerPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		checkoutResultEClass.getESuperTypes().add(this.getDownloadResult());
		referenceDataValueEClass.getESuperTypes().add(this.getDataValue());
		listDataValueEClass.getESuperTypes().add(this.getDataValue());
		simpleDataValueEClass.getESuperTypes().add(this.getDataValue());
		objectAddedEClass.getESuperTypes().add(this.getCompareItem());
		objectRemovedEClass.getESuperTypes().add(this.getCompareItem());
		objectModifiedEClass.getESuperTypes().add(this.getCompareItem());
		queryEnginePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		webModulePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		modelMergerPluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		modelComparePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		internalServicePluginConfigurationEClass.getESuperTypes().add(this.getPluginConfiguration());
		objectDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		primitiveDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		arrayDefinitionEClass.getESuperTypes().add(this.getTypeDefinition());
		objectTypeEClass.getESuperTypes().add(this.getType());
		primitiveTypeEClass.getESuperTypes().add(this.getType());
		longTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		byteArrayTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		doubleTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		stringTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		booleanTypeEClass.getESuperTypes().add(this.getPrimitiveType());
		arrayTypeEClass.getESuperTypes().add(this.getType());
		percentageChangeEClass.getESuperTypes().add(this.getRemoteServiceUpdate());
		modelCheckerResultHeaderEClass.getESuperTypes().add(this.getModelCheckerResultItem());
		modelCheckerResultLineEClass.getESuperTypes().add(this.getModelCheckerResultItem());
		messagingSerializerPluginConfigurationEClass.getESuperTypes().add(this.getSerializerPluginConfiguration());
		singleProjectAuthorizationEClass.getESuperTypes().add(this.getAuthorization());
		storeExtendedDataEClass.getESuperTypes().add(this.getAction());
		checkinRevisionEClass.getESuperTypes().add(this.getAction());
		runServiceAuthorizationEClass.getESuperTypes().add(this.getAuthorization());
		longCheckinActionStateEClass.getESuperTypes().add(this.getLongActionState());

		// Initialize classes and features; add operations and parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Name(), ecorePackage.getEString(), "name", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_HasAuthorizedUsers(), this.getUser(), this.getUser_HasRightsOn(),
				"hasAuthorizedUsers", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ConcreteRevisions(), this.getConcreteRevision(), this.getConcreteRevision_Project(),
				"concreteRevisions", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Revisions(), this.getRevision(), this.getRevision_Project(), "revisions", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_LastConcreteRevision(), this.getConcreteRevision(), null, "lastConcreteRevision",
				null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_LastRevision(), this.getRevision(), null, "lastRevision", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Checkouts(), this.getCheckout(), this.getCheckout_Project(), "checkouts", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_State(), this.getObjectState(), "state", null, 0, 1, Project.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CreatedDate(), ecorePackage.getEDate(), "createdDate", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_GeoTag(), this.getGeoTag(), this.getGeoTag_Projects(), "geoTag", null, 0, 1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_SubProjects(), this.getProject(), this.getProject_Parent(), "subProjects", null, 0,
				-1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Parent(), this.getProject(), this.getProject_SubProjects(), "parent", null, 0, 1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Description(), ecorePackage.getEString(), "description", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_ExportLengthMeasurePrefix(), this.getSIPrefix(), "exportLengthMeasurePrefix", null, 0,
				1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ExtendedData(), this.getExtendedData(), this.getExtendedData_Project(),
				"extendedData", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Services(), this.getService(), this.getService_Project(), "services", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_Logs(), theLogPackage.getProjectRelated(), theLogPackage.getProjectRelated_Project(),
				"logs", null, 0, -1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_ModelCheckers(), this.getModelCheckerInstance(), null, "modelCheckers", null, 0, -1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_SendEmailOnNewRevision(), ecorePackage.getEBoolean(), "sendEmailOnNewRevision", null,
				0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getProject_NewServices(), this.getNewService(), null, "newServices", null, 0, -1, Project.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProject_CheckinInProgress(), ecorePackage.getELong(), "checkinInProgress", null, 0, 1,
				Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(userEClass, User.class, "User", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Name(), ecorePackage.getEString(), "name", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_PasswordHash(), ecorePackage.getEByteArray(), "passwordHash", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_PasswordSalt(), ecorePackage.getEByteArray(), "passwordSalt", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_HasRightsOn(), this.getProject(), this.getProject_HasAuthorizedUsers(), "hasRightsOn",
				null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_State(), this.getObjectState(), "state", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_CreatedOn(), ecorePackage.getEDate(), "createdOn", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_CreatedBy(), this.getUser(), null, "createdBy", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUser_UserType(), this.getUserType(), "userType", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Username(), ecorePackage.getEString(), "username", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastSeen(), ecorePackage.getEDate(), "lastSeen", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Token(), ecorePackage.getEString(), "token", null, 0, 1, User.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_ValidationToken(), ecorePackage.getEByteArray(), "validationToken", null, 0, 1,
				User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getUser_ValidationTokenCreated(), ecorePackage.getEDate(), "validationTokenCreated", null, 0, 1,
				User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getUser_UserSettings(), this.getUserSettings(), null, "userSettings", null, 0, 1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Schemas(), this.getExtendedDataSchema(), this.getExtendedDataSchema_Users(), "schemas",
				null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_ExtendedData(), this.getExtendedData(), this.getExtendedData_User(), "extendedData",
				null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Services(), this.getService(), this.getService_User(), "services", null, 0, -1,
				User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Logs(), theLogPackage.getUserRelated(), theLogPackage.getUserRelated_User(), "logs",
				null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_OAuthAuthorizationCodes(), this.getOAuthAuthorizationCode(), null,
				"oAuthAuthorizationCodes", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_OAuthIssuedAuthorizationCodes(), this.getOAuthAuthorizationCode(),
				this.getOAuthAuthorizationCode_User(), "oAuthIssuedAuthorizationCodes", null, 0, -1, User.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionEClass, Revision.class, "Revision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevision_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_User(), this.getUser(), null, "user", null, 0, 1, Revision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getRevision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Revision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Comment(), ecorePackage.getEString(), "comment", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Size(), ecorePackage.getELongObject(), "size", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_ConcreteRevisions(), this.getConcreteRevision(),
				this.getConcreteRevision_Revisions(), "concreteRevisions", null, 0, -1, Revision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRevision_LastConcreteRevision(), this.getConcreteRevision(), null, "lastConcreteRevision",
				null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Checkouts(), this.getCheckout(), this.getCheckout_Revision(), "checkouts", null, 0,
				-1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Project(), this.getProject(), this.getProject_Revisions(), "project", null, 0, 1,
				Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Tag(), ecorePackage.getEString(), "tag", null, 0, 1, Revision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_LastError(), ecorePackage.getEString(), "lastError", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_Bmi(), ecorePackage.getEIntegerObject(), "bmi", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_ExtendedData(), this.getExtendedData(), this.getExtendedData_Revision(),
				"extendedData", null, 0, -1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Logs(), theLogPackage.getRevisionRelated(),
				theLogPackage.getRevisionRelated_Revision(), "logs", null, 0, -1, Revision.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getRevision_Service(), this.getService(), null, "service", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_HasGeometry(), ecorePackage.getEBoolean(), "hasGeometry", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_Bounds(), theGeometryPackage.getBounds(), null, "bounds", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_BoundsUntransformed(), theGeometryPackage.getBounds(), null, "boundsUntransformed",
				null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_BoundsMm(), theGeometryPackage.getBounds(), null, "boundsMm", null, 0, 1,
				Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_BoundsUntransformedMm(), theGeometryPackage.getBounds(), null,
				"boundsUntransformedMm", null, 0, 1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_ServicesLinked(), this.getNewService(), null, "servicesLinked", null, 0, -1,
				Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevision_DensityCollection(), this.getDensityCollection(), null, "densityCollection", null, 0,
				1, Revision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevision_NrPrimitives(), ecorePackage.getELong(), "nrPrimitives", null, 0, 1, Revision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(concreteRevisionEClass, ConcreteRevision.class, "ConcreteRevision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConcreteRevision_Id(), ecorePackage.getEIntegerObject(), "id", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Project(), this.getProject(), this.getProject_ConcreteRevisions(), "project",
				null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Checksum(), ecorePackage.getEByteArray(), "checksum", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Revisions(), this.getRevision(), this.getRevision_ConcreteRevisions(),
				"revisions", null, 0, -1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Size(), ecorePackage.getELongObject(), "size", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Date(), ecorePackage.getEDate(), "date", null, 0, 1, ConcreteRevision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_LastError(), ecorePackage.getEString(), "lastError", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_Clear(), ecorePackage.getEBoolean(), "clear", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Summary(), this.getRevisionSummary(), null, "summary", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_User(), this.getUser(), null, "user", null, 0, 1, ConcreteRevision.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_IfcHeader(), this.getIfcHeader(), null, "ifcHeader", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_Bounds(), theGeometryPackage.getBounds(), null, "bounds", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_BoundsUntransformed(), theGeometryPackage.getBounds(), null,
				"boundsUntransformed", null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_OidCounters(), ecorePackage.getEByteArray(), "oidCounters", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getConcreteRevision_MultiplierToMm(), ecorePackage.getEFloat(), "multiplierToMm", null, 0, 1,
				ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getConcreteRevision_DensityCollection(), this.getDensityCollection(), null, "densityCollection",
				null, 0, 1, ConcreteRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(geoTagEClass, GeoTag.class, "GeoTag", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGeoTag_Enabled(), ecorePackage.getEBooleanObject(), "enabled", null, 0, 1, GeoTag.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGeoTag_Projects(), this.getProject(), this.getProject_GeoTag(), "projects", null, 0, -1,
				GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_X(), ecorePackage.getEDoubleObject(), "x", null, 0, 1, GeoTag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_Y(), ecorePackage.getEDoubleObject(), "y", null, 0, 1, GeoTag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_Z(), ecorePackage.getEDoubleObject(), "z", null, 0, 1, GeoTag.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_Epsg(), ecorePackage.getEIntegerObject(), "epsg", null, 0, 1, GeoTag.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getGeoTag_DirectionAngle(), ecorePackage.getEDoubleObject(), "directionAngle", null, 0, 1,
				GeoTag.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(checkoutEClass, Checkout.class, "Checkout", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckout_User(), this.getUser(), null, "user", null, 0, 1, Checkout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getCheckout_Revision(), this.getRevision(), this.getRevision_Checkouts(), "revision", null, 0, 1,
				Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Project(), this.getProject(), this.getProject_Checkouts(), "project", null, 0, 1,
				Checkout.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckout_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Checkout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Checkin(), this.getRevision(), null, "checkin", null, 0, 1, Checkout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCheckout_Active(), ecorePackage.getEBooleanObject(), "active", null, 0, 1, Checkout.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCheckout_Logs(), theLogPackage.getCheckoutRelated(),
				theLogPackage.getCheckoutRelated_Checkout(), "logs", null, 0, -1, Checkout.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(serverSettingsEClass, ServerSettings.class, "ServerSettings", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerSettings_SendConfirmationEmailAfterRegistration(), ecorePackage.getEBoolean(),
				"sendConfirmationEmailAfterRegistration", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_AllowSelfRegistration(), ecorePackage.getEBooleanObject(),
				"allowSelfRegistration", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_AllowUsersToCreateTopLevelProjects(), ecorePackage.getEBoolean(),
				"allowUsersToCreateTopLevelProjects", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_CheckinMergingEnabled(), ecorePackage.getEBooleanObject(),
				"checkinMergingEnabled", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SmtpServer(), ecorePackage.getEString(), "smtpServer", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_EmailSenderAddress(), ecorePackage.getEString(), "emailSenderAddress", null, 0,
				1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_EmailSenderName(), ecorePackage.getEString(), "emailSenderName", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SiteAddress(), ecorePackage.getEString(), "siteAddress", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_GenerateGeometryOnCheckin(), ecorePackage.getEBoolean(),
				"generateGeometryOnCheckin", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_AllowOnlyWhitelisted(), ecorePackage.getEBoolean(), "allowOnlyWhitelisted",
				null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_WhitelistedDomains(), ecorePackage.getEString(), "whitelistedDomains", null, 0,
				-1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_HideUserListForNonAdmin(), ecorePackage.getEBooleanObject(),
				"hideUserListForNonAdmin", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_ProtocolBuffersPort(), ecorePackage.getEIntegerObject(), "protocolBuffersPort",
				null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_CacheOutputFiles(), ecorePackage.getEBooleanObject(), "cacheOutputFiles", null,
				0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerSettings_WebModules(), this.getWebModulePluginConfiguration(),
				this.getWebModulePluginConfiguration_ServerSettings(), "webModules", null, 0, -1, ServerSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerSettings_WebModule(), this.getWebModulePluginConfiguration(), null, "webModule", null,
				0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_ServiceRepositoryUrl(), ecorePackage.getEString(), "serviceRepositoryUrl",
				null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SendEmailOnNewRevision(), ecorePackage.getEBoolean(), "sendEmailOnNewRevision",
				null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SessionTimeOutSeconds(), ecorePackage.getEInt(), "sessionTimeOutSeconds",
				"2592000", 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SmtpUsername(), ecorePackage.getEString(), "smtpUsername", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SmtpPassword(), ecorePackage.getEString(), "smtpPassword", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SmtpPort(), ecorePackage.getEInt(), "smtpPort", "25", 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_SmtpProtocol(), this.getSmtpProtocol(), "smtpProtocol", "SMTP", 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_ReuseGeometry(), ecorePackage.getEBoolean(), "reuseGeometry", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_AllowCreateValidatedUser(), ecorePackage.getEBoolean(),
				"allowCreateValidatedUser", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_RenderEngineProcesses(), ecorePackage.getEInt(), "renderEngineProcesses", "1",
				0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_PluginStrictVersionChecking(), ecorePackage.getEBoolean(),
				"pluginStrictVersionChecking", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServerSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, ServerSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_StoreLastLogin(), ecorePackage.getEBoolean(), "storeLastLogin", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_StoreServiceRuns(), ecorePackage.getEBoolean(), "storeServiceRuns", null, 0, 1,
				ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerSettings_OptimizeMappedItems(), ecorePackage.getEBoolean(), "optimizeMappedItems", null,
				0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServerSettings_DefaultRenderEnginePlugin(), this.getPluginDescriptor(), null,
				"defaultRenderEnginePlugin", null, 0, 1, ServerSettings.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userSettingsEClass, UserSettings.class, "UserSettings", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSettings_Serializers(), this.getSerializerPluginConfiguration(),
				this.getSerializerPluginConfiguration_UserSettings(), "serializers", null, 0, -1, UserSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_ObjectIDMs(), this.getObjectIDMPluginConfiguration(),
				this.getObjectIDMPluginConfiguration_UserSettings(), "objectIDMs", null, 0, -1, UserSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_RenderEngines(), this.getRenderEnginePluginConfiguration(),
				this.getRenderEnginePluginConfiguration_UserSettings(), "renderEngines", null, 0, -1,
				UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Deserializers(), this.getDeserializerPluginConfiguration(),
				this.getDeserializerPluginConfiguration_UserSettings(), "deserializers", null, 0, -1,
				UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_QueryEngines(), this.getQueryEnginePluginConfiguration(),
				this.getQueryEnginePluginConfiguration_UserSettings(), "queryEngines", null, 0, -1, UserSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_ModelMergers(), this.getModelMergerPluginConfiguration(),
				this.getModelMergerPluginConfiguration_UserSettings(), "modelMergers", null, 0, -1, UserSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_ModelCompares(), this.getModelComparePluginConfiguration(),
				this.getModelComparePluginConfiguration_UserSettings(), "modelCompares", null, 0, -1,
				UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultModelMerger(), this.getModelMergerPluginConfiguration(), null,
				"defaultModelMerger", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultModelCompare(), this.getModelComparePluginConfiguration(), null,
				"defaultModelCompare", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultQueryEngine(), this.getQueryEnginePluginConfiguration(), null,
				"defaultQueryEngine", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultRenderEngine(), this.getRenderEnginePluginConfiguration(), null,
				"defaultRenderEngine", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultSerializer(), this.getSerializerPluginConfiguration(), null,
				"defaultSerializer", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_DefaultObjectIDM(), this.getObjectIDMPluginConfiguration(), null,
				"defaultObjectIDM", null, 0, 1, UserSettings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserSettings_Services(), this.getInternalServicePluginConfiguration(),
				this.getInternalServicePluginConfiguration_UserSettings(), "services", null, 0, -1, UserSettings.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginConfigurationEClass, PluginConfiguration.class, "PluginConfiguration", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginConfiguration_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginConfiguration_Enabled(), ecorePackage.getEBooleanObject(), "enabled", null, 0, 1,
				PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginConfiguration_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginConfiguration_PluginDescriptor(), this.getPluginDescriptor(),
				this.getPluginDescriptor_Configurations(), "pluginDescriptor", null, 0, 1, PluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginConfiguration_Settings(), this.getObjectType(), null, "settings", null, 0, 1,
				PluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serializerPluginConfigurationEClass, SerializerPluginConfiguration.class,
				"SerializerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSerializerPluginConfiguration_ObjectIDM(), this.getObjectIDMPluginConfiguration(),
				this.getObjectIDMPluginConfiguration_Serializers(), "objectIDM", null, 0, 1,
				SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerializerPluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_Serializers(), "userSettings", null, 0, 1, SerializerPluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSerializerPluginConfiguration_RenderEngine(), this.getRenderEnginePluginConfiguration(),
				this.getRenderEnginePluginConfiguration_Serializers(), "renderEngine", null, 0, 1,
				SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSerializerPluginConfiguration_Streaming(), ecorePackage.getEBoolean(), "streaming", null, 0,
				1, SerializerPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIDMPluginConfigurationEClass, ObjectIDMPluginConfiguration.class,
				"ObjectIDMPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectIDMPluginConfiguration_Serializers(), this.getSerializerPluginConfiguration(),
				this.getSerializerPluginConfiguration_ObjectIDM(), "serializers", null, 0, -1,
				ObjectIDMPluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectIDMPluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_ObjectIDMs(), "userSettings", null, 0, 1, ObjectIDMPluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renderEnginePluginConfigurationEClass, RenderEnginePluginConfiguration.class,
				"RenderEnginePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRenderEnginePluginConfiguration_Serializers(), this.getSerializerPluginConfiguration(),
				this.getSerializerPluginConfiguration_RenderEngine(), "serializers", null, 0, -1,
				RenderEnginePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRenderEnginePluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_RenderEngines(), "userSettings", null, 0, 1, RenderEnginePluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deserializerPluginConfigurationEClass, DeserializerPluginConfiguration.class,
				"DeserializerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDeserializerPluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_Deserializers(), "userSettings", null, 0, 1, DeserializerPluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(downloadResultEClass, DownloadResult.class, "DownloadResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDownloadResult_ProjectName(), ecorePackage.getEString(), "projectName", null, 0, 1,
				DownloadResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDownloadResult_RevisionNr(), ecorePackage.getEIntegerObject(), "revisionNr", null, 0, 1,
				DownloadResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDownloadResult_File(), this.getDataHandler(), "file", null, 0, 1, DownloadResult.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDownloadResult_SerializerOid(), ecorePackage.getELong(), "serializerOid", null, 0, 1,
				DownloadResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(checkoutResultEClass, CheckoutResult.class, "CheckoutResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(dataValueEClass, DataValue.class, "DataValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataValue_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1, DataValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dataObjectEClass, DataObject.class, "DataObject", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDataObject_Type(), ecorePackage.getEString(), "type", null, 0, 1, DataObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObject_Guid(), ecorePackage.getEString(), "guid", null, 0, 1, DataObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDataObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, DataObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDataObject_Values(), this.getDataValue(), null, "values", null, 0, -1, DataObject.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userSessionEClass, UserSession.class, "UserSession", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserSession_User(), this.getUser(), null, "user", null, 0, 1, UserSession.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_Username(), ecorePackage.getEString(), "username", null, 0, 1, UserSession.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_Name(), ecorePackage.getEString(), "name", null, 0, 1, UserSession.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_Type(), this.getUserType(), "type", null, 0, 1, UserSession.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_RemoteAddress(), ecorePackage.getEString(), "remoteAddress", null, 0, 1,
				UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_ActiveSince(), ecorePackage.getEDate(), "activeSince", null, 0, 1,
				UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_LastActive(), ecorePackage.getEDate(), "lastActive", null, 0, 1,
				UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUserSession_AccessMethod(), theLogPackage.getAccessMethod(), "accessMethod", null, 0, 1,
				UserSession.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(migrationEClass, Migration.class, "Migration", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMigration_Number(), ecorePackage.getEIntegerObject(), "number", null, 0, 1, Migration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigration_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Migration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMigration_Executed(), ecorePackage.getEBooleanObject(), "executed", null, 0, 1,
				Migration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(referenceDataValueEClass, ReferenceDataValue.class, "ReferenceDataValue", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReferenceDataValue_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1,
				ReferenceDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceDataValue_Guid(), ecorePackage.getEString(), "guid", null, 0, 1,
				ReferenceDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(listDataValueEClass, ListDataValue.class, "ListDataValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListDataValue_Values(), this.getDataValue(), null, "values", null, 0, -1, ListDataValue.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(simpleDataValueEClass, SimpleDataValue.class, "SimpleDataValue", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleDataValue_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1,
				SimpleDataValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(databaseInformationItemEClass, DatabaseInformationItem.class, "DatabaseInformationItem",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInformationItem_Key(), ecorePackage.getEString(), "key", null, 0, 1,
				DatabaseInformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformationItem_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				DatabaseInformationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseInformationCategoryEClass, DatabaseInformationCategory.class, "DatabaseInformationCategory",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInformationCategory_Title(), ecorePackage.getEString(), "title", null, 0, 1,
				DatabaseInformationCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseInformationCategory_Items(), this.getDatabaseInformationItem(), null, "items", null,
				0, -1, DatabaseInformationCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(databaseInformationEClass, DatabaseInformation.class, "DatabaseInformation", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDatabaseInformation_NumberOfProjects(), ecorePackage.getEIntegerObject(), "numberOfProjects",
				null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_NumberOfUsers(), ecorePackage.getEIntegerObject(), "numberOfUsers", null,
				0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_NumberOfRevisions(), ecorePackage.getEIntegerObject(),
				"numberOfRevisions", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_NumberOfCheckouts(), ecorePackage.getEIntegerObject(),
				"numberOfCheckouts", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_DatabaseSizeInBytes(), ecorePackage.getELongObject(),
				"databaseSizeInBytes", null, 0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_Type(), ecorePackage.getEString(), "type", null, 0, 1,
				DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_Created(), ecorePackage.getEDate(), "created", null, 0, 1,
				DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_Location(), ecorePackage.getEString(), "location", null, 0, 1,
				DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDatabaseInformation_SchemaVersion(), ecorePackage.getEIntegerObject(), "schemaVersion", null,
				0, 1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDatabaseInformation_Categories(), this.getDatabaseInformationCategory(), null, "categories",
				null, 0, -1, DatabaseInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginDescriptorEClass, PluginDescriptor.class, "PluginDescriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_PluginClassName(), ecorePackage.getEString(), "pluginClassName", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Location(), ecorePackage.getEString(), "location", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Enabled(), ecorePackage.getEBooleanObject(), "enabled", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_PluginInterfaceClassName(), ecorePackage.getEString(),
				"pluginInterfaceClassName", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginDescriptor_Configurations(), this.getPluginConfiguration(),
				this.getPluginConfiguration_PluginDescriptor(), "configurations", null, 0, -1, PluginDescriptor.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginDescriptor_InstallForNewUsers(), ecorePackage.getEBoolean(), "installForNewUsers", null,
				0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginDescriptor_PluginBundleVersion(), this.getPluginBundleVersion(), null,
				"pluginBundleVersion", null, 0, 1, PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginDescriptor_Settings(), this.getObjectType(), null, "settings", null, 0, 1,
				PluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionSummaryTypeEClass, RevisionSummaryType.class, "RevisionSummaryType", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevisionSummaryType_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				RevisionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevisionSummaryType_Count(), ecorePackage.getEIntegerObject(), "count", null, 0, 1,
				RevisionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRevisionSummaryType_Schema(), ecorePackage.getEString(), "schema", null, 0, 1,
				RevisionSummaryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionSummaryContainerEClass, RevisionSummaryContainer.class, "RevisionSummaryContainer",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevisionSummaryContainer_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				RevisionSummaryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionSummaryContainer_Types(), this.getRevisionSummaryType(), null, "types", null, 0, -1,
				RevisionSummaryContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionSummaryEClass, RevisionSummary.class, "RevisionSummary", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevisionSummary_List(), this.getRevisionSummaryContainer(), null, "list", null, 0, -1,
				RevisionSummary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longActionEClass, LongAction.class, "LongAction", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongAction_Identification(), ecorePackage.getEString(), "identification", null, 0, 1,
				LongAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getLongAction_User(), this.getUser(), null, "user", null, 0, 1, LongAction.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getLongAction_Start(), ecorePackage.getEDate(), "start", null, 0, 1, LongAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAction_Username(), ecorePackage.getEString(), "username", null, 0, 1, LongAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongAction_Name(), ecorePackage.getEString(), "name", null, 0, 1, LongAction.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectIDMPluginDescriptorEClass, ObjectIDMPluginDescriptor.class, "ObjectIDMPluginDescriptor",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectIDMPluginDescriptor_ClassName(), ecorePackage.getEString(), "className", null, 0, 1,
				ObjectIDMPluginDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareItemEClass, CompareItem.class, "CompareItem", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareItem_DataObject(), this.getDataObject(), null, "dataObject", null, 0, 1,
				CompareItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(objectAddedEClass, ObjectAdded.class, "ObjectAdded", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectRemovedEClass, ObjectRemoved.class, "ObjectRemoved", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectModifiedEClass, ObjectModified.class, "ObjectModified", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectModified_FieldName(), ecorePackage.getEString(), "fieldName", null, 0, 1,
				ObjectModified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectModified_OldValue(), ecorePackage.getEString(), "oldValue", null, 0, 1,
				ObjectModified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getObjectModified_NewValue(), ecorePackage.getEString(), "newValue", null, 0, 1,
				ObjectModified.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(compareContainerEClass, CompareContainer.class, "CompareContainer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompareContainer_Type(), ecorePackage.getEString(), "type", null, 0, 1,
				CompareContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getCompareContainer_Items(), this.getCompareItem(), null, "items", null, 0, -1,
				CompareContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(compareResultEClass, CompareResult.class, "CompareResult", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCompareResult_Items(), this.getCompareContainer(), null, "items", null, 0, -1,
				CompareResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longActionStateEClass, LongActionState.class, "LongActionState", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongActionState_Start(), ecorePackage.getEDate(), "start", null, 0, 1, LongActionState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_End(), ecorePackage.getEDate(), "end", null, 0, 1, LongActionState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Progress(), ecorePackage.getEIntegerObject(), "progress", null, 0, 1,
				LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_State(), this.getActionState(), "state", null, 0, 1, LongActionState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Title(), ecorePackage.getEString(), "title", null, 0, 1,
				LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Stage(), ecorePackage.getEInt(), "stage", null, 0, 1, LongActionState.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Errors(), ecorePackage.getEString(), "errors", null, 0, -1,
				LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Warnings(), ecorePackage.getEString(), "warnings", null, 0, -1,
				LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_Infos(), ecorePackage.getEString(), "infos", null, 0, -1,
				LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongActionState_TopicId(), ecorePackage.getELong(), "topicId", null, 0, 1,
				LongActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serverInfoEClass, ServerInfo.class, "ServerInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServerInfo_ServerState(), this.getServerState(), "serverState", null, 0, 1, ServerInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServerInfo_ErrorMessage(), ecorePackage.getEString(), "errorMessage", null, 0, 1,
				ServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getServerInfo_Version(), this.getVersion(), null, "version", null, 0, 1, ServerInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionEClass, Version.class, "Version", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersion_Major(), ecorePackage.getEIntegerObject(), "major", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Minor(), ecorePackage.getEIntegerObject(), "minor", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Revision(), ecorePackage.getEIntegerObject(), "revision", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_FullString(), ecorePackage.getEString(), "fullString", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_Date(), ecorePackage.getEDate(), "date", null, 0, 1, Version.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_DownloadUrl(), ecorePackage.getEString(), "downloadUrl", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_SupportUrl(), ecorePackage.getEString(), "supportUrl", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVersion_SupportEmail(), ecorePackage.getEString(), "supportEmail", null, 0, 1, Version.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Data(), ecorePackage.getEByteArray(), "data", null, 0, 1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Mime(), ecorePackage.getEString(), "mime", null, 0, 1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFile_Size(), ecorePackage.getELong(), "size", null, 0, 1, File.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedDataSchemaEClass, ExtendedDataSchema.class, "ExtendedDataSchema", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedDataSchema_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Url(), ecorePackage.getEString(), "url", null, 0, 1,
				ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_ContentType(), ecorePackage.getEString(), "contentType", null, 0, 1,
				ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedDataSchema_File(), this.getFile(), null, "file", null, 0, 1, ExtendedDataSchema.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedDataSchema_Size(), ecorePackage.getELong(), "size", null, 0, 1,
				ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedDataSchema_Users(), this.getUser(), this.getUser_Schemas(), "users", null, 0, -1,
				ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedDataSchema_ExtendedData(), this.getExtendedData(), this.getExtendedData_Schema(),
				"extendedData", null, 0, -1, ExtendedDataSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(extendedDataEClass, ExtendedData.class, "ExtendedData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExtendedData_Url(), ecorePackage.getEString(), "url", null, 0, 1, ExtendedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_File(), this.getFile(), null, "file", null, 0, 1, ExtendedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_Size(), ecorePackage.getELong(), "size", null, 0, 1, ExtendedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_Title(), ecorePackage.getEString(), "title", null, 0, 1, ExtendedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_Added(), ecorePackage.getEDate(), "added", null, 0, 1, ExtendedData.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_User(), this.getUser(), this.getUser_ExtendedData(), "user", null, 0, 1,
				ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_Schema(), this.getExtendedDataSchema(),
				this.getExtendedDataSchema_ExtendedData(), "schema", null, 0, 1, ExtendedData.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getExtendedData_Revision(), this.getRevision(), this.getRevision_ExtendedData(), "revision",
				null, 0, 1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExtendedData_Project(), this.getProject(), this.getProject_ExtendedData(), "project", null, 0,
				1, ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getExtendedData_TimeToGenerate(), ecorePackage.getELong(), "timeToGenerate", null, 0, 1,
				ExtendedData.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(queryEnginePluginConfigurationEClass, QueryEnginePluginConfiguration.class,
				"QueryEnginePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getQueryEnginePluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_QueryEngines(), "userSettings", null, 0, 1, QueryEnginePluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(webModulePluginConfigurationEClass, WebModulePluginConfiguration.class,
				"WebModulePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getWebModulePluginConfiguration_ServerSettings(), this.getServerSettings(),
				this.getServerSettings_WebModules(), "serverSettings", null, 0, 1, WebModulePluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelMergerPluginConfigurationEClass, ModelMergerPluginConfiguration.class,
				"ModelMergerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelMergerPluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_ModelMergers(), "userSettings", null, 0, 1, ModelMergerPluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelComparePluginConfigurationEClass, ModelComparePluginConfiguration.class,
				"ModelComparePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModelComparePluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_ModelCompares(), "userSettings", null, 0, 1, ModelComparePluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(profileDescriptorEClass, ProfileDescriptor.class, "ProfileDescriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProfileDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileDescriptor_PublicProfile(), ecorePackage.getEBoolean(), "publicProfile", null, 0, 1,
				ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProfileDescriptor_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ProfileDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceDescriptorEClass, ServiceDescriptor.class, "ServiceDescriptor", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Url(), ecorePackage.getEString(), "url", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Token(), ecorePackage.getEString(), "token", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_NotificationProtocol(), theLogPackage.getAccessMethod(),
				"notificationProtocol", null, 0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_Trigger(), this.getTrigger(), "trigger", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ReadRevision(), ecorePackage.getEBoolean(), "readRevision", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ReadExtendedData(), ecorePackage.getEString(), "readExtendedData", null, 0,
				1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_WriteRevision(), ecorePackage.getEBoolean(), "writeRevision", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_WriteExtendedData(), ecorePackage.getEString(), "writeExtendedData", null,
				0, 1, ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_CompanyUrl(), ecorePackage.getEString(), "companyUrl", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_NewProfileUrl(), ecorePackage.getEString(), "newProfileUrl", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_RegisterUrl(), ecorePackage.getEString(), "registerUrl", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceDescriptor_AuthorizeUrl(), ecorePackage.getEString(), "authorizeUrl", null, 0, 1,
				ServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ServiceName(), ecorePackage.getEString(), "serviceName", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ServiceIdentifier(), ecorePackage.getEString(), "serviceIdentifier", null, 0, 1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProviderName(), ecorePackage.getEString(), "providerName", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Url(), ecorePackage.getEString(), "url", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Token(), ecorePackage.getEString(), "token", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_NotificationProtocol(), theLogPackage.getAccessMethod(), "notificationProtocol", null,
				0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Description(), ecorePackage.getEString(), "description", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_Trigger(), this.getTrigger(), "trigger", null, 0, 1, Service.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ReadRevision(), ecorePackage.getEBoolean(), "readRevision", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ReadExtendedData(), this.getExtendedDataSchema(), null, "readExtendedData", null, 0,
				1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_WriteRevision(), this.getProject(), null, "writeRevision", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_WriteExtendedData(), this.getExtendedDataSchema(), null, "writeExtendedData", null, 0,
				1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfileIdentifier(), ecorePackage.getEString(), "profileIdentifier", null, 0, 1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfileName(), ecorePackage.getEString(), "profileName", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfileDescription(), ecorePackage.getEString(), "profileDescription", null, 0, 1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getService_ProfilePublic(), ecorePackage.getEBoolean(), "profilePublic", null, 0, 1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getService_Project(), this.getProject(), this.getProject_Services(), "project", null, 0, 1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_User(), this.getUser(), this.getUser_Services(), "user", null, 0, 1, Service.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_InternalService(), this.getInternalServicePluginConfiguration(), null,
				"internalService", null, 0, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getService_ModelCheckers(), this.getModelCheckerInstance(), null, "modelCheckers", null, 0, -1,
				Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tokenEClass, Token.class, "Token", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getToken_TokenString(), ecorePackage.getEString(), "tokenString", null, 0, 1, Token.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getToken_Expires(), ecorePackage.getELong(), "expires", null, 0, 1, Token.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(internalServicePluginConfigurationEClass, InternalServicePluginConfiguration.class,
				"InternalServicePluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInternalServicePluginConfiguration_RemoteAccessible(), ecorePackage.getEBoolean(),
				"remoteAccessible", null, 0, 1, InternalServicePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInternalServicePluginConfiguration_UserSettings(), this.getUserSettings(),
				this.getUserSettings_Services(), "userSettings", null, 0, 1, InternalServicePluginConfiguration.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInternalServicePluginConfiguration_PublicProfile(), ecorePackage.getEBoolean(),
				"publicProfile", null, 0, 1, InternalServicePluginConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceInterfaceEClass, ServiceInterface.class, "ServiceInterface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterface_NameSpace(), ecorePackage.getEString(), "nameSpace", null, 0, 1,
				ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceInterface_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1,
				ServiceInterface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceMethodEClass, ServiceMethod.class, "ServiceMethod", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceMethod_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMethod_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ServiceMethod.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceMethod_ReturnDoc(), ecorePackage.getEString(), "returnDoc", null, 0, 1,
				ServiceMethod.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceFieldEClass, ServiceField.class, "ServiceField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceField_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceField_Type(), this.getServiceType(), null, "type", null, 0, 1, ServiceField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceField_GenericType(), this.getServiceType(), null, "genericType", null, 0, 1,
				ServiceField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceField_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ServiceField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(serviceTypeEClass, ServiceType.class, "ServiceType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ServiceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_SimpleName(), ecorePackage.getEString(), "simpleName", null, 0, 1,
				ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getServiceType_Fields(), this.getServiceField(), null, "fields", null, 0, -1, ServiceType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceType_SimpleType(), this.getServiceSimpleType(), "simpleType", null, 0, 1,
				ServiceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(serviceParameterEClass, ServiceParameter.class, "ServiceParameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getServiceParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getServiceParameter_Doc(), ecorePackage.getEString(), "doc", null, 0, 1, ServiceParameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceParameter_Type(), this.getServiceType(), null, "type", null, 0, 1,
				ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getServiceParameter_GenericType(), this.getServiceType(), null, "genericType", null, 0, 1,
				ServiceParameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeDefinitionEClass, TypeDefinition.class, "TypeDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectDefinitionEClass, ObjectDefinition.class, "ObjectDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getObjectDefinition_Parameters(), this.getParameterDefinition(), null, "parameters", null, 0, -1,
				ObjectDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveDefinitionEClass, PrimitiveDefinition.class, "PrimitiveDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrimitiveDefinition_Type(), this.getPrimitiveEnum(), "type", null, 0, 1,
				PrimitiveDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayDefinitionEClass, ArrayDefinition.class, "ArrayDefinition", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayDefinition_Type(), this.getTypeDefinition(), null, "type", null, 0, 1,
				ArrayDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterDefinitionEClass, ParameterDefinition.class, "ParameterDefinition", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Required(), ecorePackage.getEBoolean(), "required", null, 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameterDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_Type(), this.getTypeDefinition(), null, "type", null, 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameterDefinition_DefaultValue(), this.getType(), null, "defaultValue", null, 0, 1,
				ParameterDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeEClass, Type.class, "Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(objectTypeEClass, ObjectType.class, "ObjectType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getObjectType_Name(), ecorePackage.getEString(), "name", null, 0, 1, ObjectType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getObjectType_Parameters(), this.getParameter(), null, "parameters", null, 0, -1,
				ObjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(primitiveTypeEClass, PrimitiveType.class, "PrimitiveType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(longTypeEClass, LongType.class, "LongType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongType_Value(), ecorePackage.getELong(), "value", null, 0, 1, LongType.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(byteArrayTypeEClass, ByteArrayType.class, "ByteArrayType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getByteArrayType_Value(), ecorePackage.getEByteArray(), "value", null, 0, 1, ByteArrayType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(doubleTypeEClass, DoubleType.class, "DoubleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDoubleType_Value(), ecorePackage.getEDouble(), "value", null, 0, 1, DoubleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringTypeEClass, StringType.class, "StringType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringType_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanTypeEClass, BooleanType.class, "BooleanType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanType_Value(), ecorePackage.getEBoolean(), "value", null, 0, 1, BooleanType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(arrayTypeEClass, ArrayType.class, "ArrayType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getArrayType_Values(), this.getType(), null, "values", null, 0, -1, ArrayType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameter_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 0, 1, Parameter.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParameter_Value(), this.getType(), null, "value", null, 0, 1, Parameter.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(immediateNotificationResultEClass, ImmediateNotificationResult.class, "ImmediateNotificationResult",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImmediateNotificationResult_Result(), this.getNotifictionResultEnum(), "result", null, 0, 1,
				ImmediateNotificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImmediateNotificationResult_Description(), ecorePackage.getEString(), "description", null, 0,
				1, ImmediateNotificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(remoteServiceUpdateEClass, RemoteServiceUpdate.class, "RemoteServiceUpdate", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(percentageChangeEClass, PercentageChange.class, "PercentageChange", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPercentageChange_Percentage(), ecorePackage.getEInt(), "percentage", null, 0, 1,
				PercentageChange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(systemInfoEClass, SystemInfo.class, "SystemInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSystemInfo_Cpucores(), ecorePackage.getEInt(), "cpucores", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_Datetime(), ecorePackage.getEDate(), "datetime", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_Osname(), ecorePackage.getEString(), "osname", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_Osversion(), ecorePackage.getEString(), "osversion", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_UserHome(), ecorePackage.getEString(), "userHome", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemInfo_UserDir(), ecorePackage.getEString(), "userDir", null, 0, 1, SystemInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(javaInfoEClass, JavaInfo.class, "JavaInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getJavaInfo_HeapTotal(), ecorePackage.getELong(), "heapTotal", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_HeapUsed(), ecorePackage.getELong(), "heapUsed", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_HeapFree(), ecorePackage.getELong(), "heapFree", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_HeapMax(), ecorePackage.getELong(), "heapMax", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_Threads(), ecorePackage.getEInt(), "threads", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaHome(), ecorePackage.getEString(), "javaHome", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaVersion(), ecorePackage.getEString(), "javaVersion", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaVendor(), ecorePackage.getEString(), "javaVendor", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaVendorurl(), ecorePackage.getEString(), "javaVendorurl", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavavmVersion(), ecorePackage.getEString(), "javavmVersion", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavavmVendor(), ecorePackage.getEString(), "javavmVendor", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavavmName(), ecorePackage.getEString(), "javavmName", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaspecVersion(), ecorePackage.getEString(), "javaspecVersion", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaspecVendor(), ecorePackage.getEString(), "javaspecVendor", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaspecName(), ecorePackage.getEString(), "javaspecName", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaClassVersion(), ecorePackage.getEString(), "javaClassVersion", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaClasspath(), ecorePackage.getEString(), "javaClasspath", null, 0, -1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaLibrarypath(), ecorePackage.getEString(), "javaLibrarypath", null, 0, -1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaIoTmp(), ecorePackage.getEString(), "javaIoTmp", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaExtdir(), ecorePackage.getEString(), "javaExtdir", null, 0, 1, JavaInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaFileSeparator(), ecorePackage.getEString(), "javaFileSeparator", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaPathSeparator(), ecorePackage.getEString(), "javaPathSeparator", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getJavaInfo_JavaLineSeparator(), ecorePackage.getEString(), "javaLineSeparator", null, 0, 1,
				JavaInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(bimServerInfoEClass, BimServerInfo.class, "BimServerInfo", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBimServerInfo_CurrentVersion(), ecorePackage.getEString(), "currentVersion", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_CurrentDate(), ecorePackage.getEDate(), "currentDate", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_SchemaVersion(), ecorePackage.getEInt(), "schemaVersion", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_LatestDate(), ecorePackage.getEDate(), "latestDate", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_LatestVersion(), ecorePackage.getEString(), "latestVersion", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_Projects(), ecorePackage.getEInt(), "projects", null, 0, 1, BimServerInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_Revisions(), ecorePackage.getEInt(), "revisions", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_Users(), ecorePackage.getEInt(), "users", null, 0, 1, BimServerInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_Checkouts(), ecorePackage.getEInt(), "checkouts", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_ServerLogUrl(), ecorePackage.getEString(), "serverLogUrl", null, 0, 1,
				BimServerInfo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getBimServerInfo_Started(), ecorePackage.getEDate(), "started", null, 0, 1, BimServerInfo.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(projectSmallEClass, ProjectSmall.class, "ProjectSmall", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProjectSmall_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectSmall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_ParentId(), ecorePackage.getELong(), "parentId", null, 0, 1, ProjectSmall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_State(), this.getObjectState(), "state", null, 0, 1, ProjectSmall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_NrRevisions(), ecorePackage.getEInt(), "nrRevisions", null, 0, 1,
				ProjectSmall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_NrSubProjects(), ecorePackage.getEInt(), "nrSubProjects", null, 0, 1,
				ProjectSmall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_HasCheckinRights(), ecorePackage.getEBoolean(), "hasCheckinRights", null, 0, 1,
				ProjectSmall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_LastRevisionId(), ecorePackage.getELong(), "lastRevisionId", null, 0, 1,
				ProjectSmall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getProjectSmall_Schema(), ecorePackage.getEString(), "schema", null, 0, 1, ProjectSmall.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(ifcHeaderEClass, IfcHeader.class, "IfcHeader", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIfcHeader_Description(), ecorePackage.getEString(), "description", null, 0, -1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_ImplementationLevel(), ecorePackage.getEString(), "implementationLevel", null, 0, 1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_Filename(), ecorePackage.getEString(), "filename", null, 0, 1, IfcHeader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_TimeStamp(), ecorePackage.getEDate(), "timeStamp", null, 0, 1, IfcHeader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_Author(), ecorePackage.getEString(), "author", null, 0, -1, IfcHeader.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getIfcHeader_Organization(), ecorePackage.getEString(), "organization", null, 0, -1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_PreProcessorVersion(), ecorePackage.getEString(), "preProcessorVersion", null, 0, 1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_OriginatingSystem(), ecorePackage.getEString(), "originatingSystem", null, 0, 1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_IfcSchemaVersion(), ecorePackage.getEString(), "ifcSchemaVersion", null, 0, 1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getIfcHeader_Authorization(), ecorePackage.getEString(), "authorization", null, 0, 1,
				IfcHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(modelCheckerResultItemEClass, ModelCheckerResultItem.class, "ModelCheckerResultItem", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(modelCheckerResultHeaderEClass, ModelCheckerResultHeader.class, "ModelCheckerResultHeader",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelCheckerResultHeader_Text(), ecorePackage.getEString(), "text", null, 0, 1,
				ModelCheckerResultHeader.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelCheckerResultLineEClass, ModelCheckerResultLine.class, "ModelCheckerResultLine", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelCheckerResultLine_FieldOrClass(), ecorePackage.getEString(), "fieldOrClass", null, 0, 1,
				ModelCheckerResultLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerResultLine_Value(), ecorePackage.getEString(), "value", null, 0, 1,
				ModelCheckerResultLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerResultLine_ShouldBe(), ecorePackage.getEString(), "shouldBe", null, 0, 1,
				ModelCheckerResultLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerResultLine_Type(), this.getModelCheckerResultType(), "type", null, 0, 1,
				ModelCheckerResultLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerResultLine_ObjectId(), ecorePackage.getELong(), "objectId", null, 0, 1,
				ModelCheckerResultLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelCheckerResultEClass, ModelCheckerResult.class, "ModelCheckerResult", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelCheckerResult_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1,
				ModelCheckerResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getModelCheckerResult_Items(), this.getModelCheckerResultItem(), null, "items", null, 0, -1,
				ModelCheckerResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(modelCheckerInstanceEClass, ModelCheckerInstance.class, "ModelCheckerInstance", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getModelCheckerInstance_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				ModelCheckerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerInstance_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				ModelCheckerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerInstance_Code(), ecorePackage.getEString(), "code", null, 0, 1,
				ModelCheckerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerInstance_Compiled(), ecorePackage.getEByteArray(), "compiled", null, 0, 1,
				ModelCheckerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerInstance_Valid(), ecorePackage.getEBoolean(), "valid", null, 0, 1,
				ModelCheckerInstance.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getModelCheckerInstance_ModelCheckerPluginClassName(), ecorePackage.getEString(),
				"modelCheckerPluginClassName", null, 0, 1, ModelCheckerInstance.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messagingSerializerPluginConfigurationEClass, MessagingSerializerPluginConfiguration.class,
				"MessagingSerializerPluginConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(metricsEClass, Metrics.class, "Metrics", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMetrics_Interfaces(), this.getInterfaceMetric(), null, "interfaces", null, 0, -1,
				Metrics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceMetricEClass, InterfaceMetric.class, "InterfaceMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInterfaceMetric_Methods(), this.getMethodMetric(), null, "methods", null, 0, -1,
				InterfaceMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInterfaceMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, InterfaceMetric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(methodMetricEClass, MethodMetric.class, "MethodMetric", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMethodMetric_Name(), ecorePackage.getEString(), "name", null, 0, 1, MethodMetric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMetric_NrCalls(), ecorePackage.getELongObject(), "nrCalls", null, 0, 1,
				MethodMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMetric_LastCall(), ecorePackage.getEDate(), "lastCall", null, 0, 1, MethodMetric.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMetric_AverageMs(), ecorePackage.getELongObject(), "averageMs", null, 0, 1,
				MethodMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMetric_ShortestMs(), ecorePackage.getELongObject(), "shortestMs", null, 0, 1,
				MethodMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMethodMetric_LongestMs(), ecorePackage.getELongObject(), "longestMs", null, 0, 1,
				MethodMetric.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(pluginBundleVersionEClass, PluginBundleVersion.class, "PluginBundleVersion", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginBundleVersion_Version(), ecorePackage.getEString(), "version", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Type(), this.getPluginBundleType(), "type", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Mismatch(), ecorePackage.getEBoolean(), "mismatch", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Repository(), ecorePackage.getEString(), "repository", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_GroupId(), ecorePackage.getEString(), "groupId", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_ArtifactId(), ecorePackage.getEString(), "artifactId", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Icon(), ecorePackage.getEByteArray(), "icon", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Organization(), ecorePackage.getEString(), "organization", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundleVersion_Date(), ecorePackage.getEDate(), "date", null, 0, 1,
				PluginBundleVersion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginBundleEClass, PluginBundle.class, "PluginBundle", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginBundle_Organization(), ecorePackage.getEString(), "organization", null, 0, 1,
				PluginBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginBundle_Name(), ecorePackage.getEString(), "name", null, 0, 1, PluginBundle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBundle_LatestVersion(), this.getPluginBundleVersion(), null, "latestVersion", null, 0,
				1, PluginBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBundle_AvailableVersions(), this.getPluginBundleVersion(), null, "availableVersions",
				null, 0, -1, PluginBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPluginBundle_InstalledVersion(), this.getPluginBundleVersion(), null, "installedVersion",
				null, 0, 1, PluginBundle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pluginInformationEClass, PluginInformation.class, "PluginInformation", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPluginInformation_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				PluginInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginInformation_Type(), this.getPluginType(), "type", null, 0, 1, PluginInformation.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginInformation_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				PluginInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginInformation_Enabled(), ecorePackage.getEBoolean(), "enabled", null, 0, 1,
				PluginInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginInformation_Identifier(), ecorePackage.getEString(), "identifier", null, 0, 1,
				PluginInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginInformation_InstallForAllUsers(), ecorePackage.getEBoolean(), "installForAllUsers",
				null, 0, 1, PluginInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPluginInformation_InstallForNewUsers(), ecorePackage.getEBoolean(), "installForNewUsers",
				null, 0, 1, PluginInformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(oAuthServerEClass, OAuthServer.class, "OAuthServer", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOAuthServer_RegistrationUrl(), ecorePackage.getEString(), "registrationUrl", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ClientId(), ecorePackage.getEString(), "clientId", null, 0, 1, OAuthServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ClientSecret(), ecorePackage.getEString(), "clientSecret", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ClientName(), ecorePackage.getEString(), "clientName", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ClientIcon(), ecorePackage.getEByteArray(), "clientIcon", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ClientUrl(), ecorePackage.getEString(), "clientUrl", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ClientDescription(), ecorePackage.getEString(), "clientDescription", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_RedirectUrl(), ecorePackage.getEString(), "redirectUrl", null, 0, 1,
				OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ExpiresAt(), ecorePackage.getEDate(), "expiresAt", null, 0, 1, OAuthServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_IssuedAt(), ecorePackage.getEDate(), "issuedAt", null, 0, 1, OAuthServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_Incoming(), ecorePackage.getEBoolean(), "incoming", null, 0, 1, OAuthServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_ApiUrl(), ecorePackage.getEString(), "apiUrl", null, 0, 1, OAuthServer.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthServer_RegistrationEndpoint(), ecorePackage.getEString(), "registrationEndpoint", null,
				0, 1, OAuthServer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(oAuthAuthorizationCodeEClass, OAuthAuthorizationCode.class, "OAuthAuthorizationCode", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOAuthAuthorizationCode_OauthServer(), this.getOAuthServer(), null, "oauthServer", null, 0, 1,
				OAuthAuthorizationCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthAuthorizationCode_Code(), ecorePackage.getEString(), "code", null, 0, 1,
				OAuthAuthorizationCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOAuthAuthorizationCode_Authorization(), this.getAuthorization(), null, "authorization", null,
				0, 1, OAuthAuthorizationCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOAuthAuthorizationCode_User(), this.getUser(), this.getUser_OAuthIssuedAuthorizationCodes(),
				"user", null, 0, 1, OAuthAuthorizationCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOAuthAuthorizationCode_Issued(), ecorePackage.getEDate(), "issued", null, 0, 1,
				OAuthAuthorizationCode.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorizationEClass, Authorization.class, "Authorization", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(singleProjectAuthorizationEClass, SingleProjectAuthorization.class, "SingleProjectAuthorization",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSingleProjectAuthorization_Project(), this.getProject(), null, "project", null, 0, 1,
				SingleProjectAuthorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newServiceDescriptorEClass, NewServiceDescriptor.class, "NewServiceDescriptor", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewServiceDescriptor_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_Provider(), ecorePackage.getEString(), "provider", null, 0, 1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_AuthorizationUrl(), ecorePackage.getEString(), "authorizationUrl", null,
				0, 1, NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 0, 1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_ResourceUrl(), ecorePackage.getEString(), "resourceUrl", null, 0, 1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_RegisterUrl(), ecorePackage.getEString(), "registerUrl", null, 0, 1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_Inputs(), ecorePackage.getEString(), "inputs", null, 0, -1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewServiceDescriptor_Outputs(), ecorePackage.getEString(), "outputs", null, 0, -1,
				NewServiceDescriptor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(formatSerializerMapEClass, FormatSerializerMap.class, "FormatSerializerMap", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFormatSerializerMap_Format(), ecorePackage.getEString(), "format", null, 0, 1,
				FormatSerializerMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFormatSerializerMap_Serializers(), this.getSerializerPluginConfiguration(), null,
				"serializers", null, 0, -1, FormatSerializerMap.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(storeExtendedDataEClass, StoreExtendedData.class, "StoreExtendedData", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(checkinRevisionEClass, CheckinRevision.class, "CheckinRevision", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCheckinRevision_Project(), this.getProject(), null, "project", null, 0, 1,
				CheckinRevision.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newServiceEClass, NewService.class, "NewService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewService_Name(), ecorePackage.getEString(), "name", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_Provider(), ecorePackage.getEString(), "provider", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				NewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_AuthorizationUrl(), ecorePackage.getEString(), "authorizationUrl", null, 0, 1,
				NewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_TokenUrl(), ecorePackage.getEString(), "tokenUrl", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_ResourceUrl(), ecorePackage.getEString(), "resourceUrl", null, 0, 1,
				NewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_RegisterUrl(), ecorePackage.getEString(), "registerUrl", null, 0, 1,
				NewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_Input(), ecorePackage.getEString(), "input", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_OauthCode(), ecorePackage.getEString(), "oauthCode", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_Status(), this.getServiceStatus(), "status", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewService_Serializer(), this.getSerializerPluginConfiguration(), null, "serializer", null, 0,
				1, NewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_Output(), ecorePackage.getEString(), "output", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewService_Action(), this.getAction(), null, "action", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_AccessToken(), ecorePackage.getEString(), "accessToken", null, 0, 1,
				NewService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNewService_Project(), this.getProject(), null, "project", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewService_StateJson(), ecorePackage.getEString(), "stateJson", null, 0, 1, NewService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(runServiceAuthorizationEClass, RunServiceAuthorization.class, "RunServiceAuthorization",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRunServiceAuthorization_Service(), this.getInternalServicePluginConfiguration(), null,
				"service", null, 0, 1, RunServiceAuthorization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(densityCollectionEClass, DensityCollection.class, "DensityCollection", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDensityCollection_Densities(), this.getDensity(), null, "densities", null, 0, -1,
				DensityCollection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(densityEClass, Density.class, "Density", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDensity_Type(), ecorePackage.getEString(), "type", null, 0, 1, Density.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDensity_GeometryInfoId(), ecorePackage.getELong(), "geometryInfoId", null, 0, 1,
				Density.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDensity_TrianglesBelow(), ecorePackage.getELong(), "trianglesBelow", null, 0, 1,
				Density.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDensity_TrianglesAbove(), ecorePackage.getELong(), "trianglesAbove", null, 0, 1,
				Density.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDensity_Volume(), ecorePackage.getEFloat(), "volume", null, 0, 1, Density.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDensity_Density(), ecorePackage.getEFloat(), "density", null, 0, 1, Density.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(longCheckinActionStateEClass, LongCheckinActionState.class, "LongCheckinActionState", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLongCheckinActionState_Roid(), ecorePackage.getELong(), "roid", null, 0, 1,
				LongCheckinActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLongCheckinActionState_DeserializeErrorCode(), ecorePackage.getEInt(), "deserializeErrorCode",
				null, 0, 1, LongCheckinActionState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tileEClass, Tile.class, "Tile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTile_TileId(), ecorePackage.getEInt(), "tileId", null, 0, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTile_NrObjects(), ecorePackage.getEInt(), "nrObjects", null, 0, 1, Tile.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_MinBounds(), theGeometryPackage.getBounds(), null, "minBounds", null, 0, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTile_Bounds(), theGeometryPackage.getBounds(), null, "bounds", null, 0, 1, Tile.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(userTypeEEnum, UserType.class, "UserType");
		addEEnumLiteral(userTypeEEnum, UserType.SYSTEM);
		addEEnumLiteral(userTypeEEnum, UserType.ADMIN);
		addEEnumLiteral(userTypeEEnum, UserType.USER);
		addEEnumLiteral(userTypeEEnum, UserType.READ_ONLY);
		addEEnumLiteral(userTypeEEnum, UserType.MONITOR);

		initEEnum(siPrefixEEnum, SIPrefix.class, "SIPrefix");
		addEEnumLiteral(siPrefixEEnum, SIPrefix.METER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.ATTOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.FEMTOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.PICOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.NANOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.MICROMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.MILLIMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.CENTIMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.DECIMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.DECAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.HECTOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.KILOMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.MEGAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.GIGAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.TERAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.PETAMETER);
		addEEnumLiteral(siPrefixEEnum, SIPrefix.EXAMETER);

		initEEnum(objectStateEEnum, ObjectState.class, "ObjectState");
		addEEnumLiteral(objectStateEEnum, ObjectState.ACTIVE);
		addEEnumLiteral(objectStateEEnum, ObjectState.DELETED);

		initEEnum(compareTypeEEnum, CompareType.class, "CompareType");
		addEEnumLiteral(compareTypeEEnum, CompareType.ALL);
		addEEnumLiteral(compareTypeEEnum, CompareType.ADD);
		addEEnumLiteral(compareTypeEEnum, CompareType.MODIFY);
		addEEnumLiteral(compareTypeEEnum, CompareType.DELETE);

		initEEnum(actionStateEEnum, ActionState.class, "ActionState");
		addEEnumLiteral(actionStateEEnum, ActionState.UNKNOWN);
		addEEnumLiteral(actionStateEEnum, ActionState.STARTED);
		addEEnumLiteral(actionStateEEnum, ActionState.AS_ERROR);
		addEEnumLiteral(actionStateEEnum, ActionState.FINISHED);

		initEEnum(serverStateEEnum, ServerState.class, "ServerState");
		addEEnumLiteral(serverStateEEnum, ServerState.UNDEFINED);
		addEEnumLiteral(serverStateEEnum, ServerState.NOT_SETUP);
		addEEnumLiteral(serverStateEEnum, ServerState.SETUP);
		addEEnumLiteral(serverStateEEnum, ServerState.MIGRATION_REQUIRED);
		addEEnumLiteral(serverStateEEnum, ServerState.MIGRATION_IMPOSSIBLE);
		addEEnumLiteral(serverStateEEnum, ServerState.FATAL_ERROR);
		addEEnumLiteral(serverStateEEnum, ServerState.RUNNING);

		initEEnum(triggerEEnum, Trigger.class, "Trigger");
		addEEnumLiteral(triggerEEnum, Trigger.NEW_REVISION);
		addEEnumLiteral(triggerEEnum, Trigger.NEW_PROJECT);
		addEEnumLiteral(triggerEEnum, Trigger.NEW_EXTENDED_DATA);

		initEEnum(serviceSimpleTypeEEnum, ServiceSimpleType.class, "ServiceSimpleType");
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.ENUM);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.STRING);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.LONG);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.INT);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.BOOLEAN);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.FLOAT);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.DOUBLE);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.DATE);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.CLASS);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.DATAHANDLER);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.BYTEARRAY);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.LIST);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.SET);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.VOID);
		addEEnumLiteral(serviceSimpleTypeEEnum, ServiceSimpleType.UNKNOWN);

		initEEnum(primitiveEnumEEnum, PrimitiveEnum.class, "PrimitiveEnum");
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.LONG);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.DOUBLE);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.BOOLEAN);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.STRING);
		addEEnumLiteral(primitiveEnumEEnum, PrimitiveEnum.BYTE_ARRAY);

		initEEnum(notifictionResultEnumEEnum, NotifictionResultEnum.class, "NotifictionResultEnum");
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.NR_ERROR);
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.SUCCESS);
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.PROGRESS_UNKNOWN);
		addEEnumLiteral(notifictionResultEnumEEnum, NotifictionResultEnum.PROGRESS_PERCENTAGE);

		initEEnum(progressTopicTypeEEnum, ProgressTopicType.class, "ProgressTopicType");
		addEEnumLiteral(progressTopicTypeEEnum, ProgressTopicType.DOWNLOAD);
		addEEnumLiteral(progressTopicTypeEEnum, ProgressTopicType.UPLOAD);
		addEEnumLiteral(progressTopicTypeEEnum, ProgressTopicType.RUNNING_SERVICE);
		addEEnumLiteral(progressTopicTypeEEnum, ProgressTopicType.BRANCH);

		initEEnum(modelCheckerResultTypeEEnum, ModelCheckerResultType.class, "ModelCheckerResultType");
		addEEnumLiteral(modelCheckerResultTypeEEnum, ModelCheckerResultType.ERROR);
		addEEnumLiteral(modelCheckerResultTypeEEnum, ModelCheckerResultType.SUCCESS);

		initEEnum(smtpProtocolEEnum, SmtpProtocol.class, "SmtpProtocol");
		addEEnumLiteral(smtpProtocolEEnum, SmtpProtocol.SMTP);
		addEEnumLiteral(smtpProtocolEEnum, SmtpProtocol.SMTPS);
		addEEnumLiteral(smtpProtocolEEnum, SmtpProtocol.STARTTLS);

		initEEnum(pluginBundleTypeEEnum, PluginBundleType.class, "PluginBundleType");
		addEEnumLiteral(pluginBundleTypeEEnum, PluginBundleType.MAVEN);
		addEEnumLiteral(pluginBundleTypeEEnum, PluginBundleType.GITHUB);
		addEEnumLiteral(pluginBundleTypeEEnum, PluginBundleType.LOCAL);
		addEEnumLiteral(pluginBundleTypeEEnum, PluginBundleType.LOCAL_DEV);

		initEEnum(pluginTypeEEnum, PluginType.class, "PluginType");
		addEEnumLiteral(pluginTypeEEnum, PluginType.SERIALIZER);
		addEEnumLiteral(pluginTypeEEnum, PluginType.DESERIALIZER);
		addEEnumLiteral(pluginTypeEEnum, PluginType.RENDER_ENGINE);
		addEEnumLiteral(pluginTypeEEnum, PluginType.QUERY_ENGINE);
		addEEnumLiteral(pluginTypeEEnum, PluginType.OBJECT_IDM);
		addEEnumLiteral(pluginTypeEEnum, PluginType.WEB_MODULE);
		addEEnumLiteral(pluginTypeEEnum, PluginType.MODEL_MERGER);
		addEEnumLiteral(pluginTypeEEnum, PluginType.MODEL_COMPARE);
		addEEnumLiteral(pluginTypeEEnum, PluginType.MODEL_CHECKER);
		addEEnumLiteral(pluginTypeEEnum, PluginType.STILL_IMAGE_RENDER);
		addEEnumLiteral(pluginTypeEEnum, PluginType.SERVICE);

		initEEnum(serviceStatusEEnum, ServiceStatus.class, "ServiceStatus");
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.NEW);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.AUTHENTICATED);
		addEEnumLiteral(serviceStatusEEnum, ServiceStatus.NO_AUTHENTICATION);

		// Initialize data types
		initEDataType(dataHandlerEDataType, DataHandler.class, "DataHandler", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// singleindex
		createSingleindexAnnotations();
		// unique
		createUniqueAnnotations();
		// dbembed
		createDbembedAnnotations();
		// embedsreference
		createEmbedsreferenceAnnotations();
		// hidden
		createHiddenAnnotations();
		// nodatabase
		createNodatabaseAnnotations();
	}

	/**
	 * Initializes the annotations for <b>singleindex</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createSingleindexAnnotations() {
		String source = "singleindex";
		addAnnotation(getProject_Id(), source, new String[] {});
		addAnnotation(getProject_Name(), source, new String[] {});
		addAnnotation(getUser_Username(), source, new String[] {});
		addAnnotation(getPluginDescriptor_PluginClassName(), source, new String[] {});
		addAnnotation(getPluginDescriptor_Identifier(), source, new String[] {});
		addAnnotation(getExtendedDataSchema_Name(), source, new String[] {});
		addAnnotation(getOAuthServer_ClientId(), source, new String[] {});
		addAnnotation(getOAuthServer_RedirectUrl(), source, new String[] {});
		addAnnotation(getOAuthServer_ApiUrl(), source, new String[] {});
		addAnnotation(getOAuthServer_RegistrationEndpoint(), source, new String[] {});
		addAnnotation(getOAuthAuthorizationCode_Code(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>unique</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createUniqueAnnotations() {
		String source = "unique";
		addAnnotation(getUser_Username(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>dbembed</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDbembedAnnotations() {
		String source = "dbembed";
		addAnnotation(getRevision_Bounds(), source, new String[] {});
		addAnnotation(getRevision_BoundsUntransformed(), source, new String[] {});
		addAnnotation(getRevision_BoundsMm(), source, new String[] {});
		addAnnotation(getRevision_BoundsUntransformedMm(), source, new String[] {});
		addAnnotation(getConcreteRevision_Bounds(), source, new String[] {});
		addAnnotation(getConcreteRevision_BoundsUntransformed(), source, new String[] {});
		addAnnotation(getDensityCollection_Densities(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>embedsreference</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEmbedsreferenceAnnotations() {
		String source = "embedsreference";
		addAnnotation(getRevision_Bounds(), source, new String[] {});
		addAnnotation(getRevision_BoundsUntransformed(), source, new String[] {});
		addAnnotation(getRevision_BoundsMm(), source, new String[] {});
		addAnnotation(getRevision_BoundsUntransformedMm(), source, new String[] {});
		addAnnotation(getConcreteRevision_Bounds(), source, new String[] {});
		addAnnotation(getConcreteRevision_BoundsUntransformed(), source, new String[] {});
		addAnnotation(getCheckout_Revision(), source, new String[] {});
		addAnnotation(getCheckout_Checkin(), source, new String[] {});
		addAnnotation(getDataObject_Values(), source, new String[] {});
		addAnnotation(getListDataValue_Values(), source, new String[] {});
		addAnnotation(getDatabaseInformationCategory_Items(), source, new String[] {});
		addAnnotation(getDatabaseInformation_Categories(), source, new String[] {});
		addAnnotation(getRevisionSummaryContainer_Types(), source, new String[] {});
		addAnnotation(getRevisionSummary_List(), source, new String[] {});
		addAnnotation(getCompareItem_DataObject(), source, new String[] {});
		addAnnotation(getCompareContainer_Items(), source, new String[] {});
		addAnnotation(getCompareResult_Items(), source, new String[] {});
		addAnnotation(getServerInfo_Version(), source, new String[] {});
		addAnnotation(getServiceField_Type(), source, new String[] {});
		addAnnotation(getServiceField_GenericType(), source, new String[] {});
		addAnnotation(getServiceType_Fields(), source, new String[] {});
		addAnnotation(getServiceParameter_Type(), source, new String[] {});
		addAnnotation(getServiceParameter_GenericType(), source, new String[] {});
		addAnnotation(getObjectDefinition_Parameters(), source, new String[] {});
		addAnnotation(getArrayDefinition_Type(), source, new String[] {});
		addAnnotation(getParameterDefinition_Type(), source, new String[] {});
		addAnnotation(getParameterDefinition_DefaultValue(), source, new String[] {});
		addAnnotation(getObjectType_Parameters(), source, new String[] {});
		addAnnotation(getArrayType_Values(), source, new String[] {});
		addAnnotation(getParameter_Value(), source, new String[] {});
		addAnnotation(getMetrics_Interfaces(), source, new String[] {});
		addAnnotation(getInterfaceMetric_Methods(), source, new String[] {});
		addAnnotation(getPluginBundle_LatestVersion(), source, new String[] {});
		addAnnotation(getPluginBundle_AvailableVersions(), source, new String[] {});
		addAnnotation(getPluginBundle_InstalledVersion(), source, new String[] {});
		addAnnotation(getFormatSerializerMap_Serializers(), source, new String[] {});
		addAnnotation(getNewService_Action(), source, new String[] {});
		addAnnotation(getDensityCollection_Densities(), source, new String[] {});
		addAnnotation(getTile_MinBounds(), source, new String[] {});
		addAnnotation(getTile_Bounds(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>hidden</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createHiddenAnnotations() {
		String source = "hidden";
		addAnnotation(getRevision_Bounds(), source, new String[] {});
		addAnnotation(getRevision_BoundsUntransformed(), source, new String[] {});
		addAnnotation(getRevision_BoundsMm(), source, new String[] {});
		addAnnotation(getRevision_BoundsUntransformedMm(), source, new String[] {});
		addAnnotation(getConcreteRevision_Bounds(), source, new String[] {});
		addAnnotation(getConcreteRevision_BoundsUntransformed(), source, new String[] {});
		addAnnotation(getDensityCollection_Densities(), source, new String[] {});
	}

	/**
	 * Initializes the annotations for <b>nodatabase</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createNodatabaseAnnotations() {
		String source = "nodatabase";
		addAnnotation(profileDescriptorEClass, source, new String[] {});
		addAnnotation(serviceDescriptorEClass, source, new String[] {});
		addAnnotation(serviceInterfaceEClass, source, new String[] {});
		addAnnotation(serviceMethodEClass, source, new String[] {});
		addAnnotation(serviceFieldEClass, source, new String[] {});
		addAnnotation(serviceParameterEClass, source, new String[] {});
		addAnnotation(typeDefinitionEClass, source, new String[] {});
		addAnnotation(objectDefinitionEClass, source, new String[] {});
		addAnnotation(primitiveDefinitionEClass, source, new String[] {});
		addAnnotation(arrayDefinitionEClass, source, new String[] {});
		addAnnotation(parameterDefinitionEClass, source, new String[] {});
	}

} //StorePackageImpl

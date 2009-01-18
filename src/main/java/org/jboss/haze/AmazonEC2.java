package org.jboss.haze;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import com.amazonaws.ec2.doc._2008_12_01.*;

//@WebService(targetNamespace = "http://ec2.amazonaws.com/doc/2008-12-01/", name = "AmazonEC2PortType")
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
@WebService(targetNamespace = "http://ec2.amazonaws.com/doc/2008-12-01/", wsdlLocation = "WEB-INF/ec2.wsdl" )
public class AmazonEC2 implements AmazonEC2PortType {

	public AllocateAddressResponseType allocateAddress(
			AllocateAddressType allocateAddressRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public AssociateAddressResponseType associateAddress(
			AssociateAddressType associateAddressRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public AttachVolumeResponseType attachVolume(
			AttachVolumeType attachVolumeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public AuthorizeSecurityGroupIngressResponseType authorizeSecurityGroupIngress(
			AuthorizeSecurityGroupIngressType authorizeSecurityGroupIngressRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public BundleInstanceResponseType bundleInstance(
			BundleInstanceType bundleInstanceRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public CancelBundleTaskResponseType cancelBundleTask(
			CancelBundleTaskType cancelBundleTaskRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public ConfirmProductInstanceResponseType confirmProductInstance(
			ConfirmProductInstanceType confirmProductInstanceRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateKeyPairResponseType createKeyPair(
			CreateKeyPairType createKeyPairRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateSecurityGroupResponseType createSecurityGroup(
			CreateSecurityGroupType createSecurityGroupRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateSnapshotResponseType createSnapshot(
			CreateSnapshotType createSnapshotRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreateVolumeResponseType createVolume(
			CreateVolumeType createVolumeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteKeyPairResponseType deleteKeyPair(
			DeleteKeyPairType deleteKeyPairRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteSecurityGroupResponseType deleteSecurityGroup(
			DeleteSecurityGroupType deleteSecurityGroupRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteSnapshotResponseType deleteSnapshot(
			DeleteSnapshotType deleteSnapshotRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeleteVolumeResponseType deleteVolume(
			DeleteVolumeType deleteVolumeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DeregisterImageResponseType deregisterImage(
			DeregisterImageType deregisterImageRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeAddressesResponseType describeAddresses(
			DescribeAddressesType describeAddressesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeAvailabilityZonesResponseType describeAvailabilityZones(
			DescribeAvailabilityZonesType describeAvailabilityZonesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeBundleTasksResponseType describeBundleTasks(
			DescribeBundleTasksType describeBundleTasksRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeImageAttributeResponseType describeImageAttribute(
			DescribeImageAttributeType describeImageAttributeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeImagesResponseType describeImages(
			DescribeImagesType describeImagesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

    //@WebResult(name = "DescribeInstancesResponse", targetNamespace = "http://ec2.amazonaws.com/doc/2008-12-01/", partName = "DescribeInstancesRequestMsgResp")
    @WebMethod(operationName = "DescribeInstances", action = "DescribeInstances")
	public DescribeInstancesResponseType describeInstances(
			DescribeInstancesType describeInstancesRequestMsgReq) {
		System.err.println( "DESCRIBE INSTANCES" );
		//return null;
		
		DescribeInstancesResponseType response = new DescribeInstancesResponseType();
		response.setRequestId( "d0763fa3-c24e-4989-ac9c-c9eab58c15e5" );
		
		ReservationSetType reservationSet = new ReservationSetType();
		/*
		ReservationInfoType resInfo = new ReservationInfoType();
		resInfo.setOwnerId( "8675309" );
		resInfo.setReservationId( "r-8686868" );
		reservationSet.getItem().add( resInfo );
		*/
		response.setReservationSet( reservationSet );
		
		return response;
	}

	public DescribeKeyPairsResponseType describeKeyPairs(
			DescribeKeyPairsType describeKeyPairsRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeRegionsResponseType describeRegions(
			DescribeRegionsType describeRegionsRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeSecurityGroupsResponseType describeSecurityGroups(
			DescribeSecurityGroupsType describeSecurityGroupsRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeSnapshotsResponseType describeSnapshots(
			DescribeSnapshotsType describeSnapshotsRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DescribeVolumesResponseType describeVolumes(
			DescribeVolumesType describeVolumesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DetachVolumeResponseType detachVolume(
			DetachVolumeType detachVolumeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public DisassociateAddressResponseType disassociateAddress(
			DisassociateAddressType disassociateAddressRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public GetConsoleOutputResponseType getConsoleOutput(
			GetConsoleOutputType getConsoleOutputRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public ModifyImageAttributeResponseType modifyImageAttribute(
			ModifyImageAttributeType modifyImageAttributeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public RebootInstancesResponseType rebootInstances(
			RebootInstancesType rebootInstancesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public RegisterImageResponseType registerImage(
			RegisterImageType registerImageRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public ReleaseAddressResponseType releaseAddress(
			ReleaseAddressType releaseAddressRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public ResetImageAttributeResponseType resetImageAttribute(
			ResetImageAttributeType resetImageAttributeRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public RevokeSecurityGroupIngressResponseType revokeSecurityGroupIngress(
			RevokeSecurityGroupIngressType revokeSecurityGroupIngressRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public RunInstancesResponseType runInstances(
			RunInstancesType runInstancesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}

	public TerminateInstancesResponseType terminateInstances(
			TerminateInstancesType terminateInstancesRequestMsgReq) {
		// TODO Auto-generated method stub
		return null;
	}
}
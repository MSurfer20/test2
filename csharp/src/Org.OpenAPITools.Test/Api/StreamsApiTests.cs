/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing StreamsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class StreamsApiTests
    {
        private StreamsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new StreamsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of StreamsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' StreamsApi
            //Assert.IsInstanceOf(typeof(StreamsApi), instance);
        }

        
        /// <summary>
        /// Test ArchiveStream
        /// </summary>
        [Test]
        public void ArchiveStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int streamId = null;
            //var response = instance.ArchiveStream(streamId);
            //Assert.IsInstanceOf(typeof(JsonSuccess), response, "response is JsonSuccess");
        }
        
        /// <summary>
        /// Test CreateBigBlueButtonVideoCall
        /// </summary>
        [Test]
        public void CreateBigBlueButtonVideoCallTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.CreateBigBlueButtonVideoCall();
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test DeleteTopic
        /// </summary>
        [Test]
        public void DeleteTopicTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int streamId = null;
            //string topicName = null;
            //var response = instance.DeleteTopic(streamId, topicName);
            //Assert.IsInstanceOf(typeof(JsonSuccess), response, "response is JsonSuccess");
        }
        
        /// <summary>
        /// Test GetStreamId
        /// </summary>
        [Test]
        public void GetStreamIdTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string stream = null;
            //var response = instance.GetStreamId(stream);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test GetStreamTopics
        /// </summary>
        [Test]
        public void GetStreamTopicsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int streamId = null;
            //var response = instance.GetStreamTopics(streamId);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test GetStreams
        /// </summary>
        [Test]
        public void GetStreamsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? includePublic = null;
            //bool? includeWebPublic = null;
            //bool? includeSubscribed = null;
            //bool? includeAllActive = null;
            //bool? includeDefault = null;
            //bool? includeOwnerSubscribed = null;
            //var response = instance.GetStreams(includePublic, includeWebPublic, includeSubscribed, includeAllActive, includeDefault, includeOwnerSubscribed);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test GetSubscribers
        /// </summary>
        [Test]
        public void GetSubscribersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int streamId = null;
            //var response = instance.GetSubscribers(streamId);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test GetSubscriptionStatus
        /// </summary>
        [Test]
        public void GetSubscriptionStatusTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int userId = null;
            //int streamId = null;
            //var response = instance.GetSubscriptionStatus(userId, streamId);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test GetSubscriptions
        /// </summary>
        [Test]
        public void GetSubscriptionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? includeSubscribers = null;
            //var response = instance.GetSubscriptions(includeSubscribers);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test MuteTopic
        /// </summary>
        [Test]
        public void MuteTopicTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string topic = null;
            //string op = null;
            //string stream = null;
            //int? streamId = null;
            //var response = instance.MuteTopic(topic, op, stream, streamId);
            //Assert.IsInstanceOf(typeof(JsonSuccess), response, "response is JsonSuccess");
        }
        
        /// <summary>
        /// Test Subscribe
        /// </summary>
        [Test]
        public void SubscribeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<Object> subscriptions = null;
            //List<OneOfstringinteger> principals = null;
            //bool? authorizationErrorsFatal = null;
            //bool? announce = null;
            //bool? inviteOnly = null;
            //bool? historyPublicToSubscribers = null;
            //int? streamPostPolicy = null;
            //OneOfstringinteger messageRetentionDays = null;
            //var response = instance.Subscribe(subscriptions, principals, authorizationErrorsFatal, announce, inviteOnly, historyPublicToSubscribers, streamPostPolicy, messageRetentionDays);
            //Assert.IsInstanceOf(typeof(OneOfobjectobject), response, "response is OneOfobjectobject");
        }
        
        /// <summary>
        /// Test Unsubscribe
        /// </summary>
        [Test]
        public void UnsubscribeTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<string> subscriptions = null;
            //List<OneOfstringinteger> principals = null;
            //var response = instance.Unsubscribe(subscriptions, principals);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test UpdateStream
        /// </summary>
        [Test]
        public void UpdateStreamTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //int streamId = null;
            //string description = null;
            //string newName = null;
            //bool? isPrivate = null;
            //bool? isAnnouncementOnly = null;
            //int? streamPostPolicy = null;
            //bool? historyPublicToSubscribers = null;
            //OneOfstringinteger messageRetentionDays = null;
            //var response = instance.UpdateStream(streamId, description, newName, isPrivate, isAnnouncementOnly, streamPostPolicy, historyPublicToSubscribers, messageRetentionDays);
            //Assert.IsInstanceOf(typeof(JsonSuccess), response, "response is JsonSuccess");
        }
        
        /// <summary>
        /// Test UpdateSubscriptionSettings
        /// </summary>
        [Test]
        public void UpdateSubscriptionSettingsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<Object> subscriptionData = null;
            //var response = instance.UpdateSubscriptionSettings(subscriptionData);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test UpdateSubscriptions
        /// </summary>
        [Test]
        public void UpdateSubscriptionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<string> delete = null;
            //List<Object> add = null;
            //var response = instance.UpdateSubscriptions(delete, add);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
    }

}
